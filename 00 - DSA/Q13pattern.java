/*
     j
     1 2 3 4 5
     - - - - -
  i1-*
   2-* * 
   3-* * *
   4-* * * *
   5-* * * * *
 */

public class Q13pattern {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
