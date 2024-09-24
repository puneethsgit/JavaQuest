/* You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container. */
import java.util.Scanner;

public class Q24sumofDigit {
     public static int sumOfDigit(int n){
        int sum = 0;
        while(n>0){
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers: ");
        int n = sc.nextInt();
        System.out.println("The Sum of " + n +" is " + sumOfDigit(n) );
        sc.close();
    }
}
