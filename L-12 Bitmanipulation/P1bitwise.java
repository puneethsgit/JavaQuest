public class P1bitwise {

    public static void main(String[] args) {
        System.out.println((5&6));  //OUTPUT -> 4 (bitwise and)
        System.out.println((5|6)); //OUTPUT -> 7 (bitwise or)
        System.out.println((5^6)); //OUTPUT -> 3 (bitwise xor)
        System.out.println((~0)); //OUTPUT -> -1 (1s complement)
        System.out.println(~5); //OUTPUT -> -6 (1s complement)
        System.out.println(5<<2);  //OUTPUT -> 20 (left shift)
        System.out.println(6>>1);  //OUTPUT -> 3 (right shift)
    }
    
}