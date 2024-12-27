public class P1linklist {
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

    public int helper(Node head, int key) {  //O(n) TC & SC
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }

        return idx+1;
    }
    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() { //O(n)
        Node prev = null;
        Node curr = tail = head; //RTL
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        head = prev; 
    }

    public void deleteNthFromEnd(int n) {
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }

        if(n == sz) { //corner delete the head
            head = head.next; //removeFirst
            return;
        }
         
        //sz - n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return; 
    }

    //Slow - Fast Approach
    public Node findMid(Node head) {  //helper function
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; // +2
        }

        return slow; //Slow is middle point
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null) {  //no node OR one one
            return true;
        }
        //step1 - find mid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode; //current node is midNode
        Node next;
        while(curr != null) {
            next = curr.next; //store curr.next in next 
            curr.next = prev; //curr.next should point prev
            prev = curr; //prev update to curr
            curr = next; //curr update to next
        }

        Node right = prev; //right half head
        Node left = head; //left half head

        //step3 - check left half and right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }

        return true;
    }

    //Floyd's cycle finding algorithm
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast) {
                return true; //cycle exists
            }
        }
        return false; //cycle doesnt exists
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        //1->2->3->>1
        System.out.println(isCycle());
    }
}
