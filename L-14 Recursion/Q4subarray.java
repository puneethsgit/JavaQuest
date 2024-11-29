/* We are given a String S, we need to find the count of all contiguous substrings starting and ending with the same character 
 Ex : "abcab" OUTPUT - 7 a,ab,abc,abca,abcab,b,bc,bca,bcab,c,ca,cab,a,ab,b out of the above substring, there are 7 substring a,abca,b,bcab,c,a,b so only 7 contiguous substring start and end with the same character
 */

 //DRY RUN WITH STACK ANALYSIS TO UNDERSTAND
public class Q4subarray {
    public static int countSubstrs(String str, int i, int j, int n) {
        if(n == 1) {
            return 1;
        }
        if(n <= 0) {
            return 0;
        }
        
        int res = countSubstrs(str, i+1, j, n-1) + countSubstrs(str, i, j-1, n-1) - countSubstrs(str, i+1, j-1, n-2);
        if(str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(countSubstrs(str, 0, n-1, n));
    }
}
