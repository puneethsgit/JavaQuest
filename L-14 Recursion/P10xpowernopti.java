/* Print x to the power n (Optimized Approach)*/
public class P10xpowernopti {
    public static int optimizedPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        //int halfPowerSq = optimizedPower(x, n/2) * optimizedPower(x, n/2);
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        //if n is odd
        if(n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
     }

     public static void main(String[] args) {
        System.out.println(optimizedPower(2,5));
        //System.out.println(Math.pow(2, 1));
     }
}
