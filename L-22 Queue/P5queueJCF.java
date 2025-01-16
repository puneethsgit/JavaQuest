/* QUEUE USING JCF JAVA COLLECTION FRAMEWORK */
import java.util.*;
public class P5queueJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); //ArrayDeque

        //we cant create object for queue as queue is an interface so using linkedlist class or ArrayDeque queue class we can create object for queue

        //Queue<Integer> q = new ArrayDeque<>();
        
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

/* Feature	            LinkedList	           ArrayDeque
Implementation	    Doubly Linked List	    Resizable Array
Allows null             	Yes	                    No
Performance	                O(1)                   O(1) 
Memory Usage	 Higher (node pointers)	   Lower (contiguous memory)
 */