/* 
      j
      1  2  3  4  5
  i 1 01 02 03 04 05 
    2 06 07 08 09 10
    3 11 12 13 14 15
    4 16 17 18 19 20
    5 21 22 23 24 25
 */
public class Q10pattern {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (count <= 9) {
                    System.out.print("0");
                }
                System.out.print(count + " ");

                count++;
            }
            System.out.println();
        }
    }
}
