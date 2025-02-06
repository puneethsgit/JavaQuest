import java.util.Scanner;

public class P1Strings {
    public static void main(String[] args) {
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd"; //created using string literals and stored in stringpool (in heap memory)
        // String str2 = new String("xyz"); //using new keyword which force java to create new object in heap memory

        //STRINGS ARE IMMUTABLE ->
        
        //INPUT AND OUTPUT IN STRING ->

        // Scanner sc = new Scanner(System.in);
        // String name;
        // System.out.println("Enter the name");
        // name = sc.nextLine(); //.next() - only word after space wont print nextLine prints completely 
        // System.out.println(name);

        //STRING LENGTH ->

        //String str = "Puneeth S";
        //System.out.println(str.length());

        //STRING CONCATENATION ->

        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        
        //STRING .charAT()

        System.out.println(fullName.charAt(0));
        printLetters(fullName);
        
    }

    //PRINT LETTERS ->
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
}
