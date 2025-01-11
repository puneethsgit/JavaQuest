/* We have a singly linked list of characters, write a function that returns true if the given list is a
palindrome, else false.
Input : A->B->C->B->A
Output : Yes It is Palindrome

USING STACK.
Time Complexity : o(n)
Space Complexity: o(n)
*/

// Node class to represent each node in the linked list

import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null; // Next node is initially null
    }
}

public class Q1palindrome {
    public static void main(String[] args) {
        // Create nodes for linked list
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(6);
        Node six = new Node(2);
        Node seven = new Node(1);

        // Link the nodes to form the linked list
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;

        // check if the linked list is a palindrome
        boolean condition = isPalindrome(one); // as one is head
        System.out.println("Palindrome: " + condition);
    }

    // Function to check if the linked list is a palindrome
    static boolean isPalindrome(Node head) {
        // Use a slow pointer to traverse the linked list
        Node slow = head;

        // variable to store the result
        boolean ispalin = true;

        // stack to store the data of nodes for comparison
        Stack<Integer> stack = new Stack<>();

        // push all nodes data onto the stack
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.next;
        }

        // compare the the data in the stack with the linked list
        while (head != null) {
            // pop the top element from the stack
            int i = stack.pop();

            // check if the current node's data matches the popped value
            if (head.data == i) {
                ispalin = true; // continue checking
            } else {
                ispalin = false; // mismatch found break the loop
                break;
            }

            // move to the next node
            head = head.next;
        }

        return ispalin; // return the result
    }
}
