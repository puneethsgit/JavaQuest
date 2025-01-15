//SUPPORTS MULTIPLE QUEUE VARIABLES CHANGED FROM STATIC TO PRIVATE & REMOVE O(1) by using the front pointer instead of shifting elements.

//OPTIMIZED
public class P2queueAo {
    static class Queue {
        private int[] arr;
        private int size;
        private int rear;
        private int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = 0;
        }

        // Is empty
        public boolean isEmpty() {
            return rear < front;
        }

        // Is full
        public boolean isFull() {
            return rear == size - 1;
        }

        // Add
        public void add(int data) {
            if (isFull()) {
                throw new IllegalStateException("Queue is full");
            }
            rear++;
            arr[rear] = data;
        }

        // Remove
        public int remove() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            int data = arr[front];
            // arr[front] = 0; // Optional: Clear the old value
            front++;
            return data;
        }

        // Peek
        public int peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek()); // FIFO 1, 2, 3
            q.remove();
        }
    }
}
 
