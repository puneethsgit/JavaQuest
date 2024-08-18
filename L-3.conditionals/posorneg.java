import java.util.Scanner;

public class posorneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Enter number is postive " + num);
        }else if(num < 0){
            System.out.println("Enter number is negative " + num);
        }else{
            System.out.println("Wrong input");
        }
        sc.close();
    }
}
