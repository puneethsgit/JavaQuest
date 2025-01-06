/* Reverse a String Using Stack */

import java.util.Stack;

public class P6reversestringstack {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(! s.isEmpty()){
            char curr = s.pop();
            result.append(curr); //adds last
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String str = "puneeth";
        String res = reverseString(str);
        System.out.println(res);
    }
}
