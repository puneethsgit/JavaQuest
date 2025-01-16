/* QUEUE USING LINKED LIST */

import java.util.Queue;

public class P4queueLL {
    //NODE
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    
    }

    public static class Queue {
        private Node head;  //front for the queue
        private Node tail; //rear for the queue

        public Queue() {
            this.head = this.tail = null;  
        }
        
        //isempty
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        //enqueue
        public void enqueue(int data) {
            Node newNode = new Node(data);
            //cornercase
            if(head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //dequeue
        public int dequeue() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            //single element
            if(tail == head) {
                tail = head = null;
            } else {
                head = head.next; //Grabage collector removes first node as it doesnt point anywhere
            }
            return front;
        }

        //peek
        public int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return head.data;
        } 

    }


    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}

//TIME COMPLEXITY IS O(1) for all operations


/* The error occurs because you are trying to create an instance of the Node class inside the enqueue method, but Node is a non-static inner class. Non-static inner classes are associated with an instance of the enclosing class, and they cannot be instantiated from a static context (like the main method) unless they are tied to an instance of the enclosing class.

Solution
To fix this issue, you need to make the Node class static. A static nested class can be instantiated without an instance of the enclosing class. Here’s the corrected code: */