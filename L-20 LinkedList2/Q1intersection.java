/* Intersection of Two Linked Lists
In a system there are two singly linked list. By some programming error, the end node of one of the linked lists got linked to the second list, forming an inverted Y-shaped list. Write a program to get the point where two linked lists merge. 
We have to nd the intersection part in this system. */


public class Q1intersection {

    /* A static nested class (Node in Q1intersection) does not require an instance of the enclosing class to be instantiated. A non-static nested class (if omitted in P1linklist) would require an instance of the outer class. */
    static class Node  {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
        
    }

    /* Time Complexity : O(m*n) & Space Complexity : O(1) */
    public Node getIntersectionNode(Node head1, Node head2) {
        while(head2 != null) {
            Node temp = head1;
            while(temp != null) {
                if(temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;

    }


    /* Time Complexity : O(m+n) & Space Complexity : O(1) */
    public Node getIntersectionNode2(Node head1, Node head2) {
        if(head1 == null || head2 == null) return null;

        Node a = head1;
        Node b = head2;

        //if a & b have different len, then we will stop the loop after second iteration
        /* len represents the total count of nodes in a linked list, starting from the head node and traversing until the last node (where next is null). Example: If the linked list is:
        List A: 1 -> 2 -> 3 -> 4 -> null
        List B: 6 -> 7 -> 3 -> 4 -> null
        Length of List A (lenA) = 4
        Length of List B (lenB) = 4 */
        while( a!=b ) {
            a = a == null ? head2 : a.next;
            b = b == null ? head1 : b.next;
        }
        return a;
    }

    public static void main(String[] args) {
        Q1intersection list = new Q1intersection();
        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);

        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;

        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(30);
        head1.next.next = newNode;

        head1.next.next.next = null;

        Node intersectionPoint = list.getIntersectionNode2(head1, head2);

        if(intersectionPoint == null) {
            System.out.println("No intersection point");
        }
        else {
            System.out.println("intersection point :" + intersectionPoint.data);
        }

    }
}
