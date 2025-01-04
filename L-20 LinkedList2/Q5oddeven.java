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
public class Q5oddeven {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; //datatype node variable name head

    public static void main(String[] args) {
        Q5oddeven llist = new Q5oddeven();
        llist.push(11);
        llist.push
    }
}
