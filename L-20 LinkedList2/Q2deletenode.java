/*Delete N Nodes After M Nodes of a Linked List
We have a linked list and two integers M and N. Traverse the linked list such that you retain M
nodes then delete next N nodes, continue the same till end of the linked list. Diculty Level:
Rookie.
Sample Input 1 : M=2 N=2 LL: 1->2->3->4->5->6->7->8
Sample Output 1 : 1->2->5->6
*/
/* Example Walkthroughs:
Sample Input 1:
M = 2, N = 2, Linked List = 1->2->3->4->5->6->7->8
Step-by-Step Process:

Retain 2 nodes: Keep nodes 1 and 2 (output so far: 1->2).
Delete 2 nodes: Skip nodes 3 and 4 (output so far: 1->2).
Retain 2 nodes: Keep nodes 5 and 6 (output so far: 1->2->5->6).
Delete 2 nodes: Skip nodes 7 and 8 (final output: 1->2->5->6).

Sample Input 2:
M = 3, N = 2, Linked List = 1->2->3->4->5->6->7->8->9->10
Step-by-Step Process:

Retain 3 nodes: Keep nodes 1, 2, and 3 (output so far: 1->2->3).
Delete 2 nodes: Skip nodes 4 and 5 (output so far: 1->2->3).
Retain 3 nodes: Keep nodes 6, 7, and 8 (output so far: 1->2->3->6->7->8).
Delete 2 nodes: Skip nodes 9 and 10 (final output: 1->2->3->6->7->8).*/
public class Q2deletenode {
    // Time Complexity O(n) & space complexity O(1)


    // Node class to represent a linked list node
    static class Node {
        int data;  // Holds the data of the node
        Node next; // Points to the next node in the list
    }

    // Function to insert a new node at the beginning of the linked list 
    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node(); // Create a new node
        new_node.data = new_data; // Assign the data to the new node
        new_node.next = head_ref; // Set the next pointer of the new node to the current head
        head_ref = new_node; // Update the head to the new node
        return head_ref; // Return the new head of the list
    }

    // Function to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("\n"); //next line
    }

    // Function to retain M nodes and delete the next N nodes repeatedly
    static void skipMdeleteN(Node head, int M, int N) {
        Node curr = head, t;
        /* t is a temporary reference used to point to the node that follows the current node (curr) after skipping the M nodes.
         Here, t is declared as a Node type, but it has not been assigned any value yet. It is simply a reference that will be used later in the code.  
         */
        int count;

         // Traverse the linked list
        while (curr != null) {
             // Skip M nodes
            for (count = 1; count < M && curr != null; count++)
                curr = curr.next; // Move to the next node
            
            // CORNER CASE If we've reached the end of the list, stop
            if (curr == null) 
                return;

            t = curr.next;  // Point to the node after the Mth node (the first node to be deleted)
            /* The first time t gets assigned a value is here, inside the skipMdeleteN function, after M nodes have been retained. The assignment happens after the loop that skips M nodes. */

            // Delete N nodes
            for (count = 1; count <= N && t != null; count++) {
                Node temp = t; // Store the node to be deleted
                /*Why Is temp Needed?
                In the line t = t.next;, the t reference is moved to the next node. However, if we didn't store the current node in temp, we would lose the reference to the current node (t), and we wouldn't be able to delete it properly. So, we store it in temp before moving t to the next node.
                After storing temp, we don’t actually do anything with temp in the current implementation (since we're not doing anything explicitly with temp like freeing memory or explicitly deleting in Java). However, it’s still useful to follow good practices for node deletion in other languages (like C or C++), where you might need to deallocate memory. */
                t = t.next; // Move to the next node
            }

            curr.next = t; // Link the Mth node to the node after the deleted N nodes
            curr = t; // Move to the next segment
        }
    }

    public static void main(String args[]) {
        Node head = null;
        int M = 2, N = 3;
        head = push(head, 10); // Returned new head_ref stored here in head (new value)
        head = push(head, 9);
        head = push(head, 8);
        head = push(head, 7);
        head = push(head, 6);
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1); // current head
        System.out.printf("M = %d, N = %d \n" + "Linked list we have is :\n", M, N);
        printList(head); //current head passed here to print list

        // Modify the linked list by retaining M nodes and deleting N nodes
        skipMdeleteN(head, M, N); 

        System.out.printf("\nLinked list on deletion is :\n");
        printList(head);
    }

}


/* System.out.print()
Purpose: Prints text to the console without a newline.
Behavior: The output is printed on the same line, and the cursor remains at the end of the printed text. The next output will be printed right after the current output, unless you explicitly add a newline.

System.out.println()
Purpose: Prints text to the console with a newline.
Behavior: The output is printed on the same line, but after the text is printed, a newline character (\n) is automatically added. This means the cursor moves to the next line, so the next output will start from the new line.

System.out.printf()
Purpose: Prints formatted text to the console.
Behavior: printf allows you to format the output in a more controlled way, using format specifiers (like %d, %s, %f, etc.). You can specify how values should be printed (e.g., number of decimal places, padding, alignment, etc.).
Usage: It is particularly useful when you need to print variables in a specific format, such as controlling the number of decimal places for a floating-point number or printing integers with leading zeros.

*/
