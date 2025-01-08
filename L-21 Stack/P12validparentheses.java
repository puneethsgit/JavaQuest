/* Given String's Containing just the characte '(' ')' '{' '}' '[' ']' determint if the input string is valid 
 An Input String is valid if:
 a)Open brackets must be closed by the same type of bracket
 b)Open brackets must be closed in the correct order
 c)Every close bracket has a corresponding open bracket of same type
 */

import java.util.Stack;

public class P12validparentheses {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            
            if(ch == '(' || ch == '{' || ch == '[') { //opening bracket
                s.push(ch);
            } else {  //closing bracket

                if(s.isEmpty()) {  //corner case only closing bracket string ))) 
                    return false;
                }
                if((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')){  //3 conditions
                    s.pop();
                }else{
                    return false;
                }
            }
        }

        if(s.isEmpty()) {
            return true;
        }else {
            return false; 
        }
    }
    public static void main(String[] args) {
        String str = "({[}])[]"; //true
        System.out.println(isValid(str));
    }
}


/* TIME COMPLEXITY : O(n) */