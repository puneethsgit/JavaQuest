import java.util.*;
public class P12deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        //here deque is and interface and linkedlist is a class
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque); //2 1 3 4
        deque.removeFirst();
        System.out.println(deque);
        System.out.println("last elem = " + deque.getLast());
        System.out.println("first elem = " + deque.getFirst() );
    }
}
