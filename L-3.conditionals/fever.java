import java.util.Scanner;

public class fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        if(temp>100){
            System.out.println("You have Fever");
        }else{
            System.out.println("You dont have Fever");
        }
        sc.close();
    }
}
