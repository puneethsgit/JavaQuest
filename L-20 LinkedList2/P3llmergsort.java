/* Merge Sort on a LinkedList */
public class P3llmergsort {

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


    //MERGE SORT

    private Node getMid(Node head) {  //return type Node
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mide node
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1); //new node initalized with mergedLL
        Node temp = mergedLL; //points mergedLL

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1; 
                head1 = head1.next; //update
                temp = temp.next; //update
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        //2 Loops for left over elements
        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next; //returned next to neglect (remove) head -1

    }
    public Node mergeSort(Node head) {  //returns head node of sorted
        //basecase
        if(head == null || head.next == null) { //either LL is empty or LL has single element
            return head;
        }
        //find mid
        Node mid = getMid(head);

        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head); 
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }



    public static void main(String[] args) {
        P3llmergsort ll = new P3llmergsort();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print(); //5->4->3->2->1

        ll.head = ll.mergeSort(ll.head); //new head is initialized
        ll.print();

        //Time Complexity O(nlogn)
    }
}
