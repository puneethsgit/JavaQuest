/* Print Number in decreasing order n to 1  */
public class P1reccursion {
    public static void main(String[] args) {
        recursion(10);
    }

    public static void recursion(int num) {
        if (num < 1) {
            return;
        }
        System.out.print(num + " ");
        recursion(num -1);
    }

    public static void printdec(int n) {
        //BaseCase
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printdec(n-1); //recursive Call
    }
}