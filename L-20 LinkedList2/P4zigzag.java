public class P4zigzag {
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

    public void zigzag() {
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null; //break
        Node prev = null;
        Node next;

        while(curr != null) { //3 step approach
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head; //L head
        Node right = prev; //R head
        Node nextL, nextR;

        //alt merge - zigzag
        while(left != null && right != null) {
            nextL = left.next; //store
            left.next = right; //point
            nextR = right.next; //store
            right.next = nextL; //point

            //update
            left = nextL;
            right = nextR;
        }
     }

    public static void main(String[] args) {
        P4zigzag ll = new P4zigzag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        //1->2->3->4->5->null
        ll.print();
        ll.zigzag();
        ll.print();
    }
}
