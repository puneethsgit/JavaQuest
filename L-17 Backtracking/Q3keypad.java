/* Given a string containing digits from 2-9 inclusive, print all possible letter combinations that
the number could represent. You can print the answer in any order.
A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1
does not map to any letters.
Sample Input 1 : digits = "23"
Sample Output 1 : "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"
Sample Input 2 : digits = "2"
Sample Output 2 : "a", "b", "c" */
public class Q3keypad {
    static final char[][] L = {{}, {}, {'a','b','c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, 
    {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    public static void bfs(int pos, int len, StringBuilder sb, String D) {
        if(pos == len) { //basecase
            System.out.print(sb.toString() + " ");
            return;
        }
        else {
            char[] letters = L[Character.getNumericValue(D.charAt(pos))]; //letter[]=L[2]  so letters 
            for(int i=0; i<letters.length; i++) {
                bfs(pos+1, len, new StringBuilder(sb).append(letters[i]), D); //recursion call
            }   
        }
    }
    public static void letterCombination(String D) { //Wrapper Function
        int len = D.length();
        if(len == 0) {
            System.out.println("EMPTY INPUT");
            return;
        }
        bfs(0, len, new StringBuilder(), D);  //FUNCTION CALL 
        //0 = pos, len = total num of digit, string builder, input D
    }
    public static void main(String[] args) {
        letterCombination("283");
    }
}