/* 
      j
      1  2  3  4  5
  i 1 01 02 03 04 05 
    2 02 04 06 08 10
    3 03 06 09 12 15
    4 04 08 12 16 20
    5 05 10 15 20 25
 */
public class Q11pattern {
    public static void main(String[] args) {
        int n = 5;
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if ((i * j) <= 9) {
                    System.out.print("0");
                }
                System.out.print(i * j + " ");

            }
            System.out.println();
        }
    }

}
