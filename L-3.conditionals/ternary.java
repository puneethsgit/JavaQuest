import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        System.out.println("enter the number to check odd or even");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = (n % 2 == 0) ? "even" : "odd";
        System.out.println(ans);
        sc.close();
    }
}
