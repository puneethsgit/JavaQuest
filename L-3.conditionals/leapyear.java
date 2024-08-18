import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year to check for leap year");
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        sc.close();
    }
}

/*
 * if (year % 4 == 0) {
 * if (year % 100 == 0) {
 * if (year % 400 == 0) {
 * System.out.println("Leap year " + year);
 * } else {
 * System.out.println("Not a leap year " + year);
 * }
 * } else {
 * System.out.println("Leap year " + year);
 * }
 * } else {
 * System.out.println("Not a leap year " + year);
 * }
 */
