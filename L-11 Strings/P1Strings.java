import java.util.Scanner;

public class P1Strings {
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        String str = "abcd"; //created using string literals and stored in stringpool (in heap memory)
        String str2 = new String("xyz"); //using new keyword which force java to create new object in heap memory

        //STRINGS ARE IMMUTABLE
        
        //input&ouput of string
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter the name");
        name = sc.next();
        System.out.println();
    }
}
