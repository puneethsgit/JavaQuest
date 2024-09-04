//Prime Num using function Optimized

import java.util.Scanner;

public class p9funprimeopti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num to check");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
    }

    public static boolean isPrime(int n){
        // boolean isPrime = true;

        //cornercase
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
                //break; return isPrime;
            }
        }
        return true;
    }
}
