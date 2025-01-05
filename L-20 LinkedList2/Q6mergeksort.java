/* Merge k Sorted Lists
We have K sorted linked lists of size N each, merge them and print the sorted output.
Sample Input 1 : k = 2, n = 2
l1 = 1->3->NULL
l2 = 6->8->NULL
l3 = 9->10->NULL
Sample Output 1 : 1>3->6->8->9->10->NULL */

/* BRUTE FORCE APPROACH */
/* A brute force approach to merge K sorted linked lists into a single sorted list to extract all node values into a Arraylist. Then we sort this Arraylist and reconstruct the linked list from these sorted node values */

import java.util.ArrayList;
import java.util.Collections;

class Node {
    int data;
    Node next;

    // Constructor with both data and next node as parameters
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor with only data as a parameter, sets next to null
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Q6mergeksort {


    //Function to convert an ArrayList to a Linked list
    static Node convertArrToLinkedList(ArrayList<Integer> arr) {
        //Create a dummy Node to serve as the head of the linked list
        Node dummyNode = new Node(-1, null);
        Node temp = dummyNode;

        //Iterate through the ArrayLists and Create nodes with elements
        for(int i=0; i<arr.size(); i++) {
            //Create a new node with the ArrayList element
            temp.next = new Node(arr.get(i), null);
            //move the temporary pointer to the newly created node
            temp = temp.next;
        }

        //Return the Linked List starting from next of the dummy node
        return dummyNode.next;
        
    }


    //Function to merge K sorted Linked List
    static Node mergeKLists(ArrayList<Node> listArray) {
        //Create an ArrayList to store node values
        ArrayList<Integer> arr = new ArrayList<>();

        //Iterate through the listArray containing all linked lists
        for(int i=0; i < listArray.size(); i++) {
            //Initialize a temporary pointer to the head of the current linked list
            Node temp = listArray.get(i);

            //Traverse through the current linked list (all LL will be traversed here)
            while(temp != null) {
                //Store the data of each node in the ArrayList
                arr.add(temp.data);
                //Move to the next node in the linked list
                temp = temp.next;
            }
        }

        //Sort the ArrayList containing node values in ascending order
        Collections.sort(arr);

        //convert the sorted ArrayList back to a linked list and return its head
        return convertArrToLinkedList(arr);
    }

    //Function to print the Linked List
    static void printLinkedList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Create Linked lists
        /* execution comes from the right-hand side first, due to how the constructor calls are nested. ie first add 6 with next null then 4 then 2 so the head will be 2*/
        Node head1 = new Node(2, new Node(4, new Node(6))); //2->4->6->null 
        Node head2 = new Node(1, new Node(5)); //1->5->null
        Node head3 = new Node(1, new Node(1, new Node(3, new Node(7)))); //1->1->3->7->null
        Node head4 = new Node(8);

        //populate the lists ArrayList
        ArrayList<Node> lists = new ArrayList<>();
        lists.add(head1);
        lists.add(head2);
        lists.add(head3);
        lists.add(head4);

        System.out.println("Original Linked Lists:");
        for(int i=0; i<lists.size(); i++){  //++i can also be used produce same output
            System.out.print("List" + (i+1) + " : ");
            printLinkedList(lists.get(i));
        }

        //Merge the LinkedList
        Node mergedList = mergeKLists(lists);

        //print the merged Linked list
        System.out.print("Merged Linked List ");
        printLinkedList(mergedList);

    }
}
