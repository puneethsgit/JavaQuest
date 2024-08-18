import java.util.Scanner;

public class continuekeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        do {
            System.out.println("enter your number");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("number is " + n);

        } while (true);

    }

}
