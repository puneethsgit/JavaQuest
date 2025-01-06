/* Stack using LinkedList */

import java.util.Stack;

public class P2stackLL {
    static class Node {
        int data;
        Node next; //next pointer
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Stack {
        static Node head = null; //initalized head with null 
        // Removed 'static' so each stack has its own head and make it private

        //isempty
        public static boolean isEmpty() {
            return head == null;
        }

        //push
        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) { //cornercase if stack empty add newnode and make it head
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //pop
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

        System.out.println(s.head); //null print all poped
    }
}
