/*
     j
     1 2 3 4 5
     - - - - -
  i1-1
   2-1 2
   3-1 2 3
   4-1 2 3 4
   5-1 2 3 4 5
 */

public class Q15pattern {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
