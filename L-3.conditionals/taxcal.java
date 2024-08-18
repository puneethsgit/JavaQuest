import java.util.Scanner;

public class taxcal {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter you annual amount");
     int income = sc.nextInt();
     int tax;
     if(income <= 500000){
        tax = 0;
     }else if(income > 500000 && income < 1000000){
        tax = (int) (income * 0.2); //tax = amount * 20%
     }else{
        tax = (int) (income * 0.3);
     }
     sc.close();
     System.out.println("The tax amount is " + tax);
   }
}
