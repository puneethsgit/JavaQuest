import java.util.Scanner;

public class printnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        int counter = 1;
        while (counter <= number) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
        sc.close();
    }

}
