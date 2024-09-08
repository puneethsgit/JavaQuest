import java.util.Scanner;

public class Q3palindromenum {

    public static boolean palindromecheck (int x, int y){
       int reverseNum = 0;
        while(y > 0){
        int lastdigit = y % 10;
        reverseNum = reverseNum * 10 + lastdigit;
        y = y / 10;
       }
       if(x == reverseNum){
        return true;
       }else{
        return false;
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter a Second number: ");
        int y = sc.nextInt();
        System.out.println(palindromecheck(x, y));
        sc.close();
    }
}
