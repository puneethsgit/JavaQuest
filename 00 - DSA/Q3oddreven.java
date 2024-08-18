import java.util.Scanner;

public class Q3oddreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int oddSum = 0;
        int evenSum = 0;
        do {
            System.out.println("enter the number");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.println("To continue to enter number press 1, To stop press 0 or other number");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Sum of even Numbers is " + evenSum);
        System.out.println("Sum of odd Numbers is " + oddSum);
        sc.close();
    }
}
