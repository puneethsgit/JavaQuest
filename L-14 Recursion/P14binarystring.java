/*  The task is to generate all the binary strings of N bits. dont include consecutive ones */
public class P14binarystring {
    
    public static void main(String[] args) {
        binString1(3, 1, ""); //no consecutive 1S
        System.out.println("--------");
        printBinString(3, 0, ""); //no consecutive 0S
    }
    public static void printBinString(int n, int lastPlace, String str) {
        if(n==0) {
            System.out.println(str);
            return;
        }   
        printBinString(n-1, 0, str+"0");
        if(lastPlace == 0) {
            printBinString(n-1, 1, str+"1");
        }
    }
    public static void binString1(int n, int lastPlace, String str) {
        if(n == 0) {
            System.out.println(str);
            return;
        }
        binString1(n-1, 1, str+"1");
        if(lastPlace == 1) {
            binString1(n-1, 0, str+"0");
        }
    }
}
