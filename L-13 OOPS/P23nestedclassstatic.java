/* NESTED CLASS - STATIC */
public class P23nestedclassstatic {
    public static void main(String[] args) {
        // Creating an instance of the static nested class
        OuterClass.NestedStaticClass nestedObject = new OuterClass.NestedStaticClass();
        nestedObject.displayMessage(); // Beautifully displays the message
    }
}

class OuterClass {
    private static String message = "Hello from the OuterClass!";

    // Static nested class
    static class NestedStaticClass {
        void displayMessage() {
            System.out.println("Message: " + message); // message string prvt can be accessed within class
        }
    }
}