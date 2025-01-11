import java.util.Stack;

public class Q4decode {
    static String decode(String str) {
        // Stack to store numbers (repeat counts)
        Stack<Integer> integerStack = new Stack<>();
        // Stack to store strings
        Stack<StringBuilder> stringStack = new Stack<>();

        // Temporary variables to hold current string and repeat count
        StringBuilder currentString = new StringBuilder();
        int count = 0;

        // Traverse the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                // Build the repeat count for multi-digit numbers
                count = count * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push the current repeat count and string onto the stacks
                integerStack.push(count);
                stringStack.push(currentString);

                // Reset for the new block
                currentString = new StringBuilder();
                count = 0;
            } else if (ch == ']') {
                // Pop the repeat count and previous string
                int repeatCount = integerStack.pop();
                StringBuilder decodedString = stringStack.pop();

                // Append the repeated current string to the previous string
                for (int j = 0; j < repeatCount; j++) {
                    decodedString.append(currentString);
                }

                // Update the current string
                currentString = decodedString;
            } else { //excute only when if statement if false
                // Append the character to the current string
                currentString.append(ch);
            }
        }

        // Return the fully decoded string
        return currentString.toString();
    }

    public static void main(String[] args) {
        String str = "3[b2[ca]]"; // example input
        System.out.println(decode(str));
    }
}
