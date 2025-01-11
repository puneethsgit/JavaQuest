/*Decode a string
We have an encoded string s and the task is to decode it. The pattern in which the strings are
encoded is as follows.
Sample Input 1 : 2[cv]
Sample Output 1 : cvcv
Sample Input 2 : 3[b2[v]]L
Sample Output 2 : bvvbvvbvvL */

/* Step-by-Step Explanation of the Decoding Process For Second Input:
Let's break down the encoded string 3[b2[v]]L:

First, decode the inner part b2[v]:

The substring b2[v] means:
b is just a literal character.
2[v] means repeat the character v two times.
So, 2[v] becomes vv.
Thus, b2[v] becomes bvv.

Now, decode the outer part 3[bvv]:

The substring 3[bvv] means:
bvv is the string to repeat.
The number 3 means repeat bvv three times.
So, 3[bvv] becomes bvvbvvbvv.
Finally, append the letter L:

After decoding the inner and outer patterns, the string becomes bvvbvvbvvL. */

/* Time Complexity : o(n)
Space Complexity: o(n) */

import java.util.Stack;

public class Q3decodestring {
    public static String decode(String str) {
        // Stack to store numbers (repeats count)
        Stack<Integer> integerStack = new Stack<>();

        // Stack to store characters (for building the decoded String)
        Stack<Character> stringStack = new Stack<>();

        // temporary string to store intermediate decoded sections
        String temp = "", result = "";

        // traverse the input string
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            // If the character is a digit, build the repeat count (eg : 3 for 3[b])
            if (Character.isDigit(str.charAt(i))) { // return true or false
                while (Character.isDigit(str.charAt(i))) {
                    // build the number by handling multi-digit numbers (eg : 10 for 10[a])
                    count = count * 10 + str.charAt(i) - '0';
                    i++; // Move to the next character in the string to check if it's also a digit

                    // Subtracting '0' from it converts the character to its integer equivalent. For
                    // example: '5' - '0' = 5 This works because in ASCII, the character '0' has a
                    // numeric value of 48, '1' has a value of 49, and so on. Subtracting '0' (48)
                    // from a digit character gives its numeric value.

                    /*
                     * count = count * 10 + (str.charAt(i) - '0'):
                     * 
                     * This builds the number by accounting for its place value (units, tens,
                     * hundreds, etc.).
                     * For example:
                     * Suppose count is initially 0.
                     * If str.charAt(i) is '3', count = 0 * 10 + 3 = 3.
                     * If the next character is '5', count = 3 * 10 + 5 = 35.
                     * If the next character is '7', count = 35 * 10 + 7 = 357.
                     * 
                     * This ensures that multi-digit numbers are constructed correctly. & Move to
                     * the next character in the string to check if it's also a digit
                     */
                }

                // step back to the correct position after reading the entire number
                i--;

                // push the repeat count to the integer stack
                integerStack.push(count);
            }
            // if the character is a closing bracket ']' process the substring inside th
            // bracket
            else if (str.charAt(i) == ']') {
                temp = ""; // reset temp string to store the decoded substring
                count = 0; // reset the count to 0

                // pop the top element of the integer stack to get the repeat count
                if (!integerStack.isEmpty()) {
                    count = integerStack.peek();
                    integerStack.pop();
                }

                // Build the substring inside the brackets by poping characters from the string
                // stack
                while (!stringStack.isEmpty() && stringStack.peek() != '[') {
                    temp = stringStack.peek() + temp; // add charcters to temp string
                    stringStack.pop();
                }

                // remove the opening brackets '[' from the stack
                if (!stringStack.isEmpty() && stringStack.peek() == '[') {
                    stringStack.pop();
                }

                // repeat the substring 'count' times and add it to the result
                for (int j = 0; j < count; j++) {
                    result = result + temp; // repeat the temp string
                }

                // push the repeated string back to string stack character by character
                for (int j = 0; j < result.length(); j++) {
                    stringStack.push(result.charAt(j));
                }

                // reset the result for the next iteration
                result = "";
            }

            // If the character is an opening bracket '[', handle cases like "3[a]" or
            // "a[b]"
            else if (str.charAt(i) == '[') {
                // If the previous character was a digit, just push the '['
                if (Character.isDigit(str.charAt(i - 1))) {
                    stringStack.push(str.charAt(i));
                } else {
                    // Otherwise, push '[' and assume the repeat count is 1
                    stringStack.push(str.charAt(i));
                    integerStack.push(1);
                }
            }

            // For all other characters (letters), push them to the string stack
            else {
                stringStack.push(str.charAt(i));
            }
        }

        // Construct the final result string by popping characters from the string stack
        while (!stringStack.isEmpty()) {
            result = stringStack.peek() + result; // Add characters to the result
            stringStack.pop();
        }

        // Return the decoded string
        return result;
    }


    public static void main(String[] args) {
        String str = "3[b2[ca]]"; // example input
        System.out.println(decode(str));
    }
}
