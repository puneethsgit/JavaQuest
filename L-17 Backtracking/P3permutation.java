/* Find Permutations, arrangements "abc" - abc,acb,bac,bca,cab,cba 
 formula for total permutation is is n! (n elements) 
 formula for total subset is 2^n 
*/
public class P3permutation {

    public static void findPermutation(String str, String ans) {
        //BaseCase
        if(str.length() == 0) {
            System.out.print(ans+ " ");
            return;
        }

        //Recursion
        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i); //exract current character
            //"abcd" => "ab" + "de" = "abde" (substring endindex is exclusive & not mention endindex means default n-1)
            String newStr = str.substring(0, i) + str.substring(i+1); 
            findPermutation(newStr, ans+curr);
        }
    }

    //STRING BUILDER
    public static void permutation(StringBuilder str, StringBuilder ans) {
        if(str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

         // Recursion: Generate permutations by picking each character
        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i); // Extract the current character
            ans.append(curr);  // Add current character to the answer
            str.deleteCharAt(i);   // Remove current character from the remaining string

            permutation(str, ans);

             // Backtracking: Restore the state for the next iteration
             str.insert(i, curr); //Reinsert the character at its original position
             ans.deleteCharAt(ans.length() - 1); //Remove the last character added
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
        //permutation(new StringBuilder(str), new StringBuilder());
    }
}
