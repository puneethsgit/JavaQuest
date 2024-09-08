import java.util.Scanner;

public class Q1avgofthree {
    public static double averageofthree(double a, double b, double c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Input First Number: ");
     double x = sc.nextDouble();
     System.out.print("Input Second Number: ");
     double y = sc.nextDouble();
     System.out.print("Input Third Number: ");
     double z = sc.nextDouble();
    System.out.print("The Average of Three Number is " + averageofthree(x, y, z));
    sc.close();
    }
}
