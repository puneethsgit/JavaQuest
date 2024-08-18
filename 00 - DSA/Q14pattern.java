/*
     j
     1 2 3 4 5
     - - - - -
  i1-1
   2-2 2
   3-3 3 3
   4-4 4 4 5
   5-5 5 5 5 5
 */

public class Q14pattern {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
