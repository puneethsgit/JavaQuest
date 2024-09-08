import java.util.Scanner;

public class Q24sumofDigit {
     public static int sumOfDigit(int n){
        int sum = 0;
        while(n>0){
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers: ");
        int n = sc.nextInt();
        System.out.println("The Sum of " + n +" is " + sumOfDigit(n) );
        sc.close();
    }
}
