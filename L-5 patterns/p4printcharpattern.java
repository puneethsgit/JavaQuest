/*
  A
  B C
  D E F
  G H I J
 */

public class p4printcharpattern {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 6;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
