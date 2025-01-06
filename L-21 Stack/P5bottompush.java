/* Push Element at the bottom of the Stack */

import java.util.Stack;

public class P5bottompush {
    
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) { //Base Case - Hit add data element when stack is empty
            s.push(data);
            return;
        }
        int top = s.pop(); //top elements removed and stored in top variable
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        pushAtBottom(s, 4);
        System.out.println(s);
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
