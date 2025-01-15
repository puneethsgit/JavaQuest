/* Queue Using Array */
public class P1queueA{
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        //isempty
        public static boolean isEmpty() {
            return rear == -1;  
        }


        //add
        public static void add(int data) {
            if(rear == size - 1) { //checking queue is full
                System.out.println("queue is full");
                return;
            }

             rear = rear + 1; //rear positon increased
             arr[rear] = data;
        }

        //remove
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            //delete element - O(n)
            for(int i=0; i<rear; i++) {
                arr[i] = arr[i+1]; //shift elements by +1
            }
            rear = rear - 1;
            return front;
        }

        //peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }

        
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek()); //FIFO 1,2,3
            q.remove();
        }
    }

}


//SUPPORTS MULTIPLE QUEUE VARIABLES CHANGED FROM STATIC TO PRIVATE

/*public class P1queueA {
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
 */