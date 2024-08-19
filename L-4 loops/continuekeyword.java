import java.util.Scanner;

public class continuekeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your number:");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;  // Skip the rest of the loop if n is divisible by 10
            }

            System.out.println("Number is: " + n);

            // Add a condition to exit the loop (e.g., when n == -1)
            if (n == -1) {
                System.out.println("Exiting the loop.");
                break;  // Exit the loop
            }

        } while (true);

        // Close the Scanner after the loop ends
        sc.close();
    }
}
