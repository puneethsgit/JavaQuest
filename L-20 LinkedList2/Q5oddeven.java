/* Odd Even Linked List
We have a Linked List of integers, write a function to modify the linked list such that all even
numbers appear before all the odd numbers in the modied linked list. Also, keep the order of
even and odd numbers same.
Sample Input 1 : 8->12->10->5->4->1->6->NULL
Sample Output 1 : 8->12->10->4->6->5->1->NULL
Sample Input 2 : 1->3->5->7->NULL
Sample Output 2 : 1->3->5->7->NULL
 */

 /* Time Complexity : O(n) & Space Complexity : O(1) */
/* Odd Even Linked List
   We modify the linked list such that all even numbers appear before odd numbers
   while maintaining their relative order.
*/
public class Q5oddeven {
    // Inner class to define a node in the linked list
    class Node {
        int data;  // Data value of the node
        Node next; // Reference to the next node

        // Constructor to initialize a node with data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // Reference to the head of the linked list

    // Function to segregate even and odd nodes
    void segregateEvenOdd() {
        Node end = head;  // Pointer to traverse to the last node
        Node prev = null; // Pointer to keep track of the previous node
        Node curr = head; // Pointer to traverse the list from the head

        // Move the `end` pointer to the last node
        while (end.next != null) {
            end = end.next;
        }

        Node new_end = end; // Keep track of the last node for modification

        // Case 1: Move odd nodes from the beginning to the end of the list
        while (curr.data % 2 != 0 && curr != end) {
            new_end.next = curr;  // Link current odd node to the end
            curr = curr.next;     // Move to the next node
            new_end.next.next = null; // Set the moved node's next to null
            new_end = new_end.next;   // Update the new end
        }

        // Case 2: If the first even node is found
        if (curr.data % 2 == 0) {
            head = curr; // Update head to point to the first even node

            // Traverse the list to rearrange even and odd nodes
            while (curr != end) {
                if (curr.data % 2 == 0) {
                    // If current node is even, just move to the next node
                    prev = curr;
                    curr = curr.next;
                } else {
                    // If current node is odd, move it to the end
                    prev.next = curr.next;  // Skip the current odd node
                    curr.next = null;       // Set the current odd node's next to null
                    new_end.next = curr;    // Link the odd node to the end
                    new_end = curr;         // Update the new end
                    curr = prev.next;       // Move to the next node
                }
            }
        } else {
            // If no even node is found, update `prev` to the last odd node
            prev = curr;
        }

        // Case 3: If the last node is odd, move it to the end
        if (new_end != end && end.data % 2 != 0) {
            prev.next = end.next;  // Skip the last odd node
            end.next = null;       // Set the last odd node's next to null
            new_end.next = end;    // Link the last odd node to the end
        }
    }

    // Function to print the linked list
    void printList() {
        Node temp = head; // Temporary pointer to traverse the list
        while (temp != null) {
            System.out.print(temp.data + " "); // Print current node's data
            temp = temp.next; // Move to the next node
        }
        System.out.println(); // Print a new line after the list
    }

    // Function to add a new node to the front of the list
    void push(int new_data) {
        Node new_node = new Node(new_data); // Create a new node
        new_node.next = head;              // Link the new node to the current head
        head = new_node;                   // Update head to the new node
    }

    // Main function to test the program
    public static void main(String[] args) {
        Q5oddeven llist = new Q5oddeven();
        
        // Add nodes to the linked list
        llist.push(11);
        llist.push(10);
        llist.push(8);
        llist.push(6);
        llist.push(4);
        llist.push(3);
        llist.push(5);
        llist.push(2);
        llist.push(0);

        System.out.println("Linked List");
        llist.printList(); // Print the original list

        llist.segregateEvenOdd(); // Segregate even and odd nodes

        System.out.println("Updated Linked List");
        llist.printList(); // Print the modified list
    }
}
