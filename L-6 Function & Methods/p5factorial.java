import java.util.Scanner;

public class p5factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.println(factorial(num));
        sc.close();
    }

    public static int factorial(int num){
        int f=1;
        for(int i=1; i<=num; i++){
            f *= i; //fact = fact * i
        }
        return f;
    }
}
