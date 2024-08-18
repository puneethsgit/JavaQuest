import java.util.Scanner;

public class Q1primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check");
        int num = sc.nextInt();

        // int count = 0;
        // for (int i = 1; i <= num; i++) {
        // if (num % i == 0) {
        // count++;
        // }

        // }
        // if (count == 2) {
        // System.out.println(" prime number");
        // } else {
        // System.out.println(" not prime number");
        // }

        if (num == 2) {
            System.out.println("prime number");
        } else if (num < 2) {
            System.out.println("Not Prime Number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("prime number");
            } else {
                System.out.println("not prime number");
            }
        }

        sc.close();
    }
}
