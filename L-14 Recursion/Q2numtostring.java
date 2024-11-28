/*
You are given an number (eg-2019) convert it into a string of english like "two zero one nine" use recursive funtion to solve this problem
NOTE :- The digit of the number will only be in the range 0-9 and last digit of number cant be zero
 */
public class Q2numtostring {
      static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
      //here we havent declare this inside a function if we do so it consumes more memory in recursive call so will define it out the function And By marking the digits array as static, it means that this array belongs to the class rather than an individual instance of that class. This allows the array to be accessed directly through the class without the need to create an object of the class.

    public static void printDigits(int number) {
        if(number == 0) {
            return;
        }
        int lastDigit = number % 10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+" ");
     
    }

    //TRY STACK ANALYSIS
    public static void main(String[] args) {
        int num = 1947; 
        //noRecursion(num);
        printDigits(num);
    }

    public static void noRecursion(int num) {
        String numStr = Integer.toString(num);
        String words[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder result = new StringBuilder();
        for(int i=0; i<numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            result.append(words[digit]);
            if (i < numStr.length() - 1) { //add space
                result.append(" ");
            }
        }
        System.out.println(result.toString());
    }
}
