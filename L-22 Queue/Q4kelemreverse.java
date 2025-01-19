/* Reversing the rst K elements of a Queue
We have an integer k and a queue of integers, we need to reverse the order of the rst k
elements of the queue, leaving the other elements in the same relative order.
Sample Input 1 : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] ,k=5
Sample Output 1 : Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]  */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q4kelemreverse {

    static void reverseKElements(Queue<Integer> queue, int k) {
        //Stack to store the first k elements
        Stack<Integer> stack = new Stack<>();

        //Step 1: Dequeue the first k elements and push them to the stack
        for(int i=0; i<k; i++) {
            stack.push(queue.poll());
            //You're using poll() because it handles the case when the queue is empty more gracefully. If the queue is empty, poll() will return null, and you can safely handle it without causing an exception to be thrown.
        }

        //Step 2: pop elements from the stack and enqueue them back to the queue
        while(!stack.isEmpty()) {
            queue.offer(stack.pop());
            //When you're working with a Queue in Java, you typically use .offer() to add elements to the queue because: It ensures that the operation is safe and predictable. If you're using a bounded queue (like a PriorityQueue with a fixed size), .offer() will handle cases where the queue is full more gracefully by returning false rather than throwing an exception.
        }

        //Step 3: Dequeue the remaining elements and enqueue them back in the same order
        int size = queue.size();
        for(int i=0; i<size - k; i++) {
            queue.offer(queue.poll());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        int k = 5;

        //output before reversing
        System.out.println("Before Reversing: " + queue);

        //Reverse the first k elements
        reverseKElements(queue, k);

        System.out.println("After Reversing: " + queue);

    }
}

/*Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100) :-
Arrays.asList() is a method that converts an array (or a varargs) into a List.
In this case, it is converting a sequence of integer values (10, 20, 30, 40, 50, 60, 70, 80, 90, 100) into a List<Integer>.
Arrays.asList() returns a fixed-size list backed by the original array. It allows the list to be used as an argument to initialize the LinkedList.
Initializing the Queue :-
The LinkedList constructor is called with the list returned by Arrays.asList(). This means the LinkedList will be initialized with the elements 10, 20, 30, 40, 50, 60, 70, 80, 90, 100.
The elements are added to the LinkedList in the same order as they appear in the list, and the LinkedList now behaves as a queue. */


//O(k) + O(k) + O(n - k) = O(n) TIME COMPLEXITY

//O(n + k). = o(n) SPACE COMPLEXITY 


/* add() is used when you expect the queue to always have space (or are okay with an exception if it's full).
offer() is safer when working with bounded queues, as it won't throw an exception and allows you to handle full queue situations more gracefully by returning false. */

/* poll() is safer because it doesn't throw an exception when the queue is empty; it returns null instead.
remove() is stricter because it throws an exception if the queue is empty, which can help catch logical errors in your program if the queue is unexpectedly empty. */