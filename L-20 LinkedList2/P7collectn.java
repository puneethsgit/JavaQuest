import java.util.LinkedList;
/*The built-in LinkedList class in Java (from the java.util package) is implemented as a doubly linked list. This means that each node in the list contains references to both the next and the previous nodes. */

/*Not Circular:
The LinkedList in Java is not circular by default. The next reference of the last node is null, and the prev reference of the first node is also null. To implement a circular doubly linked list, you need to create your custom implementation. */
public class P7collectn {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Display the list
        System.out.println("LinkedList: " + list);

        // Access elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // Remove elements
        list.removeFirst();
        list.removeLast();

        // Display the updated list
        System.out.println("Updated LinkedList: " + list);
    }
}
