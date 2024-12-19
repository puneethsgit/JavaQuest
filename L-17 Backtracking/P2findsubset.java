//find Subset in a string example - "abc" -> a,b,c,ab,ac,abc,"" 
//NOTE total subset formula is 2^n 
public class P2findsubset {

    public static void findSubsets(String str, String ans, int i) {
        //BaseCase
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.print("null" + " ");
            }
            System.out.print(ans+ " ");
            return; 
        }

        //Recursion
        //YES choice
        findSubsets(str, ans+str.charAt(i), i+1);  
        //NO choice (backtracking for no choice)
        findSubsets(str, ans, i+1);
    }


    //using StringBuilder
    public static void subsets(String str, StringBuilder ans, int i) {
        if(i == str.length()) {
            if(ans.length() == 0 ){
                System.out.print("null" + " ");
            }
            System.out.print(ans + " ");
            return;
        }

        //YES
        ans.append(str.charAt(i)); //current character
        subsets(str, ans, i+1);
        ans.deleteCharAt(ans.length() -1); //last element deleted, backtrack remove last character

        //NO (backtracking)
        subsets(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
        subsets(str,new StringBuilder(), 0);
    }
}
