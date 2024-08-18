import java.util.Scanner;

public class Q4factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        sc.close();
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + num + " is " + fact);
    }
}
