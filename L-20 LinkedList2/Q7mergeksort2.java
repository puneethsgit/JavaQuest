/*MERGING LISTS TWO AT A TIME In this approach would be the inplace merging of 2 sorted linked list To merge K linked list, we can merge them two at a time. start from the first list and iteratively merge pairs of lists until only one merged list remains  
 TIME COMPLEXITY : O(N*k^2) & SPACE COMPLEXITY : O(1)
 */

 import java.util.*;

 class Node {
    int data;   
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
 }


public class Q7mergeksort2 {

    //Function to merge two sorted linked list
    public static Node mergeTwoSortedLinkedLists(Node list1, Node list2) {
        //Create a dummy node to serve as the head of the merged list
        Node dummyNode = new Node(-1, null);
        Node temp = dummyNode;

        //Traverse both lists simultaneously
        while(list1 != null && list2 != null) {
            //Compare elements of both the lists and link the similar node to the merged list
            if(list1.data <= list2.data) {
                temp.next = list1;
                list1 = list1.next;
            }else {
                temp.next = list2;
                list2 = list2.next;
            }
            //Move the temporary pointer to the next node
            temp = temp.next;  
        }

        //If any list still remaining elements, append them to the merged list
        if(list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        //Return the merged linked list starting from the next of the dummy node
        return dummyNode.next;
    }

    //Function to merge K sorted linked list
    public static Node mergeKLists(ArrayList<Node> listArray) {
        //Consider the first linked list as the starting point for merging
        Node head = listArray.get(0);  //first linked list head index 0

        //Loop through the remaining linked lists in the listArray
        for(int i=1; i< listArray.size(); i++) {  // second linked list head 1 (ArrayList) loops starts from 1
            //Merge the current 'head' linked list with next linked list
            head = mergeTwoSortedLinkedLists(head, listArray.get(i));
        }

        //return the head of the merged linked lists
        return head;
    }

    //Function to print the linked list
    public static void printLinkedList(Node head){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data  + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head1 = new Node(2, new Node(4, new Node(6)));
        Node head2 = new Node(1, new Node(5));
        Node head3 = new Node(1, new Node(1, new Node(3, new Node(7))));
        Node head4 = new Node(8);

        ArrayList<Node> lists = new ArrayList<>();
        Collections.addAll(lists, head1, head2, head3, head4);

        System.out.println("Original Linked List:");
        for(int i=0; i<lists.size(); i++) {
            System.out.print("List" + (i+1) + ": ");
            printLinkedList(lists.get(i));
        }

        //Merge the Linked lists
        Node mergedList = mergeKLists(lists);

        System.out.print("Merged Linked List: ");
        printLinkedList(mergedList);
    }
}
