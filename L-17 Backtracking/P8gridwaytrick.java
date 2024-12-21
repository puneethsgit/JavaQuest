/* Using permutaion formula that is total characters = (n-1 + m-1) so we need array total character in different ways DDRR,RDRD,DRRD...etc  (n-1 + m-1)! / (n-1)! x (m-1)! */
public class P8gridwaytrick {
    public static int gridWaysTrick(int n, int m) {

        int fact1  = factorial(n-1 + m-1);
        int fact2 = factorial(n-1) * factorial(m-1);

        return fact1 / fact2;
    }

    public static int factorial(int n) {
        if( n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
       System.out.println(gridWaysTrick(n, m));
    }
}

//O(n+m)