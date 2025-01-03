public class P5doublell {
    public class Node {
        int data;
        Node next;
        Node prev;
        
        //constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    //static variables
    public static Node head;
    public static Node tail;
    public static int size;

    //addfirst
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //print
    public void print() {
        Node temp = head;
        //System.out.print("null" + " <-> ");
        while(temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //removeFirst
    public int removeFirst() {
        if(head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE; //negative number return
        }
        if(size == 1) {  //corner case
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null; //if node is single will get error here so corner case added
        size--;
        return val;
    }

    //add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;  // Set the previous pointer of the new node to the current tail
        tail.next = newNode; // Set the next pointer of the current tail to the new node
        tail = newNode; // Update the tail to the new node
    }
    //remove last
    public int removeLast() {
        if(head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        } 
        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data; // Store the data of the last node
        tail = tail.prev;  // Move the tail pointer to the previous node
        tail.next = null; // Remove the reference to the old last node
        size--;
        return val;
    }
    /*Using a tail pointer in a singly linked list for removeLast is tricky because the tail pointer only helps you directly access the last node. */
    //reverse
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev; //head becomes prev because curr will be now null
    }
    public static void main(String[] args) {
        P5doublell dll = new P5doublell();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        //System.out.println(dll.size);
        //dll.removeFirst();
        //System.out.println(dll.size);
        //dll.print();
        //dll.reverse();
        //dll.print();
        dll.addLast(10);
        dll.print();
        dll.removeLast();
        dll.print();
    }
}
