public class P1linkedlist {

    public static class Node {
        int data; //data
        Node next; //type node as it points next node (reference to another instance of the Node class).

        public Node(int data) { //constructor
            this.data = data;
            this.next = null;
        }
    }

    //This are variables and its datatype is Node which is a custom class defined earlier
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        //Step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {  //LinkedList is Empty
            head = tail = newNode;
            return;
        }
        //Step2 = newNode next = head
        newNode.next = head; //old head linked as next in newNode

        //step3 = head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        //Step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        //Step2 = tail next - newNode
        tail.next = newNode;
        //Step3 = tail = newNode
        tail = newNode;
    }

    public void print() {
        // if(head == null) {
        //     System.out.println("LL is Empty");
        //     return;
        // }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) { //O(n)
        if(idx == 0) {
            addFirst(data); //want to add in 0th index
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i < idx-1) {
            temp = temp.next;
            i++;  
        }

        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1) {
            int val = head.data; //tail.data
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2 
        Node prev = head; //initalized with head
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;  //or tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrSearch(int key) { //O(n )
        Node temp = head;
        int i = 0;
        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1; //key not found
    }
    public static void main(String[] args) {
        P1linkedlist ll = new P1linkedlist();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.print(); //9->1->2->3->4->null
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.addLast(7);
        ll.addLast(8);
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.itrSearch(7));
    }
}