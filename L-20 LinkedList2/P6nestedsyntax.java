//Nesting of Classes
public class P6nestedsyntax {
    public class doubleLL {    
        public class Node {
            int data;
            Node next;
            Node prev;

            // Constructor
            public Node(int data) {
                this.data = data;
                this.next = null;
                this.prev = null;
            }
        }

        // Static variables
        public static Node head;
        public static Node tail;
        public static int size;

        // Constructor for nested classs
        public doubleLL() {
            head = null;
            tail = null;
            size = 0;
        }

        // Method to add a node at the end
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) { // If the list is empty
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            size++;
        }

        // Method to display the linked list
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // Main function
    public static void main(String[] args) {
        P6nestedsyntax outer = new P6nestedsyntax(); // Create an instance of the outer class
        doubleLL list = outer.new doubleLL(); // Create an instance of the doubleLL class

        // Add 5 elements to the linked list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Display the linked list
        System.out.println("Doubly Linked List:");
        list.display();
    }
}

