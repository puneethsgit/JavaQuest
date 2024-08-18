import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a & b");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("enter the operation(+,-,*,/,%)");
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println("a+b = "+ (a+b));
                break;
            case '-':
                System.out.println("a-b = "+ (a-b));
                break;
            case '*':
                System.out.println("a*b = " + (a*b));
                break;
            case '/':
                System.out.println("a/b = " + (a/b));
                break;
            case '%':
                System.out.println("a%b = " + (a%b));
                break;
            default:
                System.out.println("The entered character is wrong");
                break;
        }
        sc.close();
    }
}
