/* Given a positive integer number N. The task is to generate all the binary strings of N bits. These binary strings should be in ascending order.
Examples: 

Input: 2
Output:
0 0
0 1
1 0
1 1 */
public class P14binarystring {
    
    public static void main(String[] args) {
        printBinString(3, 0, "");
    }
    public static void printBinString(int n, int lastPlace, String str) {

        //work
        // if(lastPlace == 0) {
        //     printBinString1(n-1, 0, str.append("0"));
        //     printBinString1(n-1, 1, str.append("1"));
        // } else {
        //     printBinString1(n-1, 0, str.append("0"));
        // }

        if(n==0) {
            System.out.println(str);
            return;
        }
        printBinString(n-1, 0, str+"0");
        if(lastPlace == 0) {
            printBinString(n-1, 1, str+"1");
        }
    }
}
