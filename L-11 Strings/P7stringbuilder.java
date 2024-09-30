public class P7stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        
        //to add character we use append
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }

        System.out.println(sb);
        System.out.println(sb.length());
    }
    /* TO delete element */
    // for (int i = sb.length() - 1; i >= 0; i--) {
    //     sb.deleteCharAt(i);  // Removes character at index i
    // }
    // System.out.println("After removal: " + sb);  // Output: (empty string)   
}
