/* 
IN PREVIOUS CODE
IF WE TRY TO CREATE 2 STACK IT WORKS FINE BUT HERE WHAT IT HAPPENS
s.push(1);  // head -> 1
s.push(2);  // head -> 2 -> 1
s.push(3);  // head -> 3 -> 2 -> 1

p.push(10); // head -> 10
p.push(20); // head -> 20 -> 10

At this point, the stack originally managed by s (3 -> 2 -> 1) is lost because head is overwritten by p.


Static head Variable:

The head variable is declared as static, which means it is shared across all instances of the Stack class.
If you create multiple Stack objects, they will all share the same head, causing interference between the stacks.
Shared Node References:

Since all Stack instances share the same head, operations like push, pop, or peek on one stack will affect the other stacks.
How to Support Multiple Stacks
To support multiple stacks, you should remove the static keyword from the head variable. Each instance of the Stack class should have its own head pointer, like this: */
public class P3stacksyntax {
    static class Node {
        int data;
        Node next;

        Node(int data) {



            this.data = data;
            this.next = null;

        }
    }

    static class Stack {
        private Node head = null; // Removed 'static' so each stack has its own head

        // isEmpty
        public boolean isEmpty() {
            return head == null;
        }

        // push
        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        stack1.push(1);
        stack1.push(2);

        stack2.push(10);
        stack2.push(20);

        System.out.println("Stack 1:");
        while (!stack1.isEmpty()) {
            System.out.println(stack1.peek());
            stack1.pop();
        }

        System.out.println("Stack 2:");
        while (!stack2.isEmpty()) {
            System.out.println(stack2.peek());
            stack2.pop();
        }
    }
}
