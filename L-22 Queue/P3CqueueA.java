/*CIRCULAR QUEUE USING ARRAY FORMULAT FOR FRONT front = (front+1) % size AND FOR REAR rear = (rear+1) % size */

/*1. Is it Required to Make Methods Static? (FUNCTION STATIC)
No, it is not required to make these methods static. A static method is tied to the class rather than to an instance of the class. Since a queue is typically designed to work with instances (each queue instance having its own data), making the methods static is generally not appropriate unless you only need a single shared queue.

2. Advantages of Static Methods
No Need for an Object Instance:
Static methods can be called without creating an instance of the class.
Example:
java
Copy code
Queue.peek();
Useful if you need utility-like functionality (e.g., a static helper method). */

import java.util.Queue;

public class P3CqueueA {
    static class Queue {
        private int arr[];
        private int size;
        private int rear;
        private int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        //isempty
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        //isfull
        public boolean isFull() {
            return (rear+1) % size == front;
        }

        //add
        public void add(int data) {
            if(isFull()) {
                System.out.println("queue is full");
                return;
            }
            //add first element
            if(front == -1) {
                front = 0; 
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //remove (now implementaion with O(1))
        public int remove() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int result = arr[front];

            //last element delete
            if(rear == front) {
                rear = front = -1;
            }else {
                front = (front + 1) % size;
            }
            return result;
        }

        //peek
        public int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
        
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(8);  //here print queue is full
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}


/*     static class Queue<T> {
        private T[] arr;
        private int size;
        private int rear;
        private int front;

        Queue(int n) {
            arr = (T[]) new Object[n]; // Generic array creation
            size = n;
            rear = -1;
            front = -1;
        }
            
         public static void main(String[] args) {
        Queue<Integer> q = new Queue<>(3); 
        
        
In Java, T[] represents a generic array.
Generics: Generics allow you to write code that can work with different data types without sacrificing type safety.
T[]: T is a type parameter. It's a placeholder for an actual data type that will be specified when you create an instance of the class or method that uses this generic type.
T[] specifically refers to an array of elements of type T.*/