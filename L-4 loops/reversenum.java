import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {

        /* using while */

        // int n = 1182002;
        // while (n > 0) {
        // int lastdigit = n % 10;
        // System.out.print(lastdigit);
        // n /= 10;
        // }

        /* using for */

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number to reverse");
        // int n = sc.nextInt();
        // sc.close();
        // for (; n > 0; n /= 10) {
        // int lastdigit = n % 10;
        // System.out.print(lastdigit);
        // }

        /* optimized code */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to reverse");
        int n = sc.nextInt();
        sc.close();
        int reverseNum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            reverseNum = reverseNum * 10 + lastdigit;
            n /= 10;
        }
        System.out.println(reverseNum);

    }
}
