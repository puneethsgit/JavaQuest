/* Print x to the power n */
public class P9xpowern {
    public static int power(int x, int n) {
        //if(n == 0) return 1;
        
        if(n==0) {
            return 1;
        }

        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n-1);  //single line
    }
    public static void main(String[] args) {
        System.out.println(power(2, 90000));
    }
}