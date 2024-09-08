import java.util.Scanner;

public class Q20iseven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if(isEven(n)){
            System.out.println("Is a Even Number");
        }else{
            System.out.println("Is a odd Number");
        }
        sc.close();
    }

    public static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
