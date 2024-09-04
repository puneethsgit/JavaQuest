import java.util.Scanner;

public class p4productab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a value");
        int a = sc.nextInt();
        System.out.println("enter b value");
        int b = sc.nextInt();
        System.out.println("The product of a and b is : " + product(a, b));
        sc.close();
    }
    public static int product (int x, int y){
        int pro = x * y;
        return pro;
    }
}
