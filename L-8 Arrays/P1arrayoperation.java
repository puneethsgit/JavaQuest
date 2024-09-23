import java.util.Scanner;

public class P1arrayoperation {
    public static void main(String[] args) {
        //create array
        int marks[] = new int[50];
        
        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks each");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println(marks); //prints address of the array
        System.out.println("phy: " + marks[0]);
        System.out.println("chem: " + marks[1]);
        System.out.println("math: " + marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2]) / 3;
        System.out.println("percentage: "+ percentage + "%");
        //System.out.println("uninitalized: " + marks[11]);
        //marks[1] = marks[1] + 1;
        //marks[1] = marks[2] + 1;
        //System.out.println("chem: " + marks[1]);

        //array length
        System.out.println("Length " + marks.length);
        sc.close();
    }
}
