/* Swapping Nodes in a Linked List
We have a linked list and two keys in it, swap nodes for two given keys. Nodes should be
swapped by changing links. Swapping data of nodes may be expensive in many situations when
data contains many fields. It may be assumed that all keys in the linked list are distinct.
Sample Input 1 : 1->2->3->4, x = 2, y = 4
Sample Output 1 : 1->4->3->2 */

/* Time Complexity : O(n) & space Complexity : O(1) */

public class  Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Q4swapingnodes {
    Node head;

    public void swapNodes(int x, int y) {
        if(x == y) {
            return;// If both keys are the same, no swap is needed
        }

        Node prevX = null, currX = head;
        // Search for node with value x
        while(currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
         // Search for node with value y
        while(currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // If either x or y is not present, return
        if(currX == null || currY == null) {
            return;
        }

        // If prevX is not null, update prevX.next to currY
        if(prevX != null) {     
            prevX.next = currY;  
        } else {
            head = currY; 
            /* If prevX is null, it means currX is the head of the list. So, we update the head to point to currY because currY is now the new first node.(We want to swap nodes with values 1 and 4. currX will point to the node with value 4, and prevX will point to the node with value 3. currY will point to the node with value 1, and prevY will be null because currY is the head.) */
        }
        
        // If prevY is not null, update prevY.next to currX
        if(prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
            /*if prevY is not null, we update prevY.next to point to currX, linking the node before currY to currX.
            If prevY is null, it means currY is the head of the list. So, we update the head to point to currX, as currX is now the new first node. 
            */
        }

        // Swap next pointers 
        Node temp = currX.next; // Store the next node of 4 (which is 5)
        currX.next = currY.next; // 4 now points to 2 (the next of 3)
        currY.next = temp; //  3 now points to 5 (the original next of 4)
    }

    public void printList() {
        Node tNode = head;
        while(tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public void push(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }


    public static void main(String[] args) {
        Q4swapingnodes llist = new Q4swapingnodes();
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.print(" Linked list Before ");
        llist.printList();

        llist.swapNodes(4,3);

        System.out.print("\n Linked list after ");
        llist.printList();
    }
}
