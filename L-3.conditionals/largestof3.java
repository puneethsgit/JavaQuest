import java.util.Scanner;

public class largestof3 {
    public static void main(String[] args) {
        System.out.println("enter the Numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(a >= b && a>=c){
            System.out.println("a is greater " + a);
        }else if(b>=c){
            System.out.println("b is greater "+ b);
        }else{
            System.out.println("c is greater "+ c);
        }
        sc.close();
    }
}
