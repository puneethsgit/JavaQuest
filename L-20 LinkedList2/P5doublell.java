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
    //remove last

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
        System.out.println(dll.size);
        //dll.removeFirst();
        //System.out.println(dll.size);
        //dll.print();
        dll.reverse();
        dll.print();
    }
}
