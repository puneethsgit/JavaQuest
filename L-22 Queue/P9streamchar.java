/* Find non-repeating letter in a stream of characters
 input :  a a b c c x b
 output : a -1 b b b b x  
 */

 import java.util.*;
public class P9streamchar {
   
    public static void printNonRepeating(String str) {
        int freq[] = new int[26]; //'a' - 'z'  initalized with 0 all index
        Queue<Character> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            
            if(q.isEmpty()) {
                System.out.print(-1+" ");
            }else {
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();
    }
   public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
   } 
}

//TC : O(n) even through while loop inside for loop beacuse in while loop it removes n element each time 