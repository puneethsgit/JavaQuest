/* DUPLICATE PARENTHESES
 Given a balanced expression, find if it contains duplicate parentheses or not. A set of parentheses are duplicate if the same subexpression is surrounded by multiple parentheses return true if it contains duplicates else return false
 EXAMPLE:
 ((a+b)+(c+d)) - FALSE, (((a+b))+c) - TRUE (because unnecessary parentheses is used)
 */

import java.util.Stack;

public class P13duplicateparentheses {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i); //current character exract

            //closing - will check closing first if closing not exits then it will opening or operator or operend(this avoid many if conditions)
            if(ch == ')') {
                int count = 0;
                while(s.peek() != '('){ 
                    //!s.isEmpty() &&  we removed this as given string is valid parentheses for every closing there will be opening
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true; //duplicate
                }else {
                    s.pop(); //opening pair pop
                }
            }
            else {  //OPENING, OPERATOR, OPEREND CONDITION
                s.push(ch);
            }
        }

        return false; //no duplicate exits in whole string so return false
    }

    public static void main(String[] args) {
        //GIVEN VALID STRING
        String str = "(((a+b)))"; //duplicates there so must return true
        String str2 = "(a-b)"; //no duplicates return false
        System.out.println(isDuplicate(str2));
    }



    //SHORT END CODE
    public static boolean isDuplicate1(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i); 
            //closing 
            if(ch == ')') {
                int count = 0;
                while(s.pop() != '('){  //directly to pop here it self has pop returns poped value if its != closing then its poped or else not
                    count++;
                }
                if(count < 1) {
                    return true; //duplicate
                }
                // else {
                //     s.pop(); //opening pair pop  {NOT REQUIRED HERE}
                // }
            }
            else {  //OPENING, OPERATOR, OPEREND CONDITION
                s.push(ch);
            }
        }

        return false; //no duplicate exits in whole string so return false
    }

}
