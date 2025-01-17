/* QUEUE USING TWO STACK */

import java.util.Stack;


public class P6Qusing2stack {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        //add
        public static void add(int data) {
            //step1
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            //step2
            s1.push(data);
            //step3
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }

        }

        //remove
        public static int remove() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return s1.pop();
        }

        //peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return s1.peek(); //here this peek stack function
        }
        
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
