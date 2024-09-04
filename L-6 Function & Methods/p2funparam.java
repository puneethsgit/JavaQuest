import java.util.Scanner;

public class p2funparam {

    public static int addition(int a, int b){
        int sum = a + b;    
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(addition(a,b));
    }
}
