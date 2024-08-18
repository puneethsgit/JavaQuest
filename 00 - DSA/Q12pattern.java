/*
     j
     1 2 3 4 5
  i1 1 2 3 4 5
   2 2 3 4 5 6
   3 3 4 5 6 7
   4 4 5 6 7 8 
   5 5 6 7 8 9
 */

public class Q12pattern {
    public static void main(String[] args) {
        int n = 5;
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print((i + j) - 1 + " ");
            }
            System.out.println();
        }
    }
}
