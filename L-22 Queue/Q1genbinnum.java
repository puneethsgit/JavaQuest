/* Given a number N. The task is to generate and print all binary numbers with deciaml values from 1 to N
Sample Input 1 : N =2
Sample Output 1 : 1 10
Sample Input 2 : 5.
Sample Output 2 : 1 10 11 100 101

  */

import java.util.LinkedList;
import java.util.Queue;

public class Q1genbinnum {
    static void generatePrintBinary(int n) {
        //create a queue to hold binary numbers as a string
        Queue<String> q = new LinkedList<String>();

        //add the first binary number "1" to the queue
        q.add("1");

        //n--: This is the post-decrement operator. It decreases the value of n by 1, but the current value of n is used in the condition check before the decrement.
        while(n-- > 0) {
            //get the front of the queue (the next binary number to print)
            String s1 = q.peek();

            //Remove the front of the queue after processing it
            q.remove();

            //print the binary number
            System.out.println(s1);

            //create the next two binary number based on the current number
            String s2 = s1; //temp copy to current
            q.add(s1 + "0"); //append "0" to the current number and add to the queue
            q.add(s2 + "1"); //append "1" to the temporary copy and add to the queue
        }
    } 
    public static void main(String[] args) {
        int n = 10;
        generatePrintBinary(n);
    }
}


/*Time Complexity : o(n)
Space Complexity: o(n)
 */