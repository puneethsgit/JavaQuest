/* Stack Using ArrayList */

import java.util.ArrayList;

public class P1stackAL {
    
    /* Static Class:
    Can only access static members of the enclosing class.
    Cannot access non-static (instance) members of the enclosing class directly. */
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        //IsEmpty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        //Push
        public static void push(int data) {
            list.add(data);  //adds element in last, as last is our top so automatically added element to top means last
        }

        //Pop
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1); //O(1)
            list.remove(list.size() - 1); //O(1)
            return top;
        }

        //Peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
