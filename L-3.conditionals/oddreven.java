import java.util.*;
public class oddreven{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        
        if(sc.hasNextInt()){
            n = sc.nextInt();
            if(n % 2 == 0){
                System.out.println("Even Number");
            }else if(n % 2 != 0){
                System.out.println("Odd Number");
            }  
        }
        else{
            System.out.println("Wrong Input");
        }
        sc.close();
    }
}