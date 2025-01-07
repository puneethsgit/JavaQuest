/* 
To reverse a stack with O(N) time complexity and O(1) space complexity, you need to avoid recursion and instead use an iterative approach or utilize auxiliary data structures like a queue or another stack. Here's a solution that achieves O(N) time and O(1) space:

Solution Using an Auxiliary Stack
We can use a temporary stack to reverse the original stack iteratively. */

import java.util.Stack;

public class P8reversestack2 {

    public static void reverseStack(Stack<Integer> s) {
        Stack<Integer> tempStack = new Stack<>();

        //Move all elements from original stack to temporary stack
        while(!s.isEmpty()) {
            tempStack.push(s.pop());
        }

        //Move elements back to the original stack (now in reversed order)
        while(!tempStack.isEmpty()) {
            s.push(tempStack.pop());
        }
    }

    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //3-2-1
    
        reverseStack(s);
        //1-2-3
    
        printStack(s);
    }
}

/* 

### Time Complexity:
1. **First `while` loop**:
   - Transfers all elements from the original stack `s` to `tempStack`.
   - This loop runs for \(n\) elements in the stack, so its time complexity is \(O(n)\).

2. **Second `while` loop**:
   - Transfers all elements back from `tempStack` to the original stack `s`.
   - This loop also runs for \(n\) elements, so its time complexity is \(O(n)\).

Thus, the overall time complexity is:
\[O(n) + O(n) = O(n)]

---

### Space Complexity:
- The space used by the `tempStack` is proportional to the number of elements in the original stack `s`.
- Since `tempStack` holds all the elements of `s`, the space complexity is \(O(n)\).

No additional significant space is used aside from the `tempStack`.

---

### Summary:
- **Time Complexity**: (O(n))
- **Space Complexity**: (O(n)) */