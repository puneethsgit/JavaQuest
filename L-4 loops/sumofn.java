import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int sum = 0, i = 1;
        while (i <= n) {
            sum += i; // sum = sum + i
            i++;
        }
        System.out.println("The Sum of N Numbers is " + sum);
        sc.close();
    }
}
