public class p12dectobin {

    public static void binToDec(int binNum){
        int myNum = binNum;
        int decNum = 0;
        int pow = 0;
        while(binNum > 0){
            int lastDigit = binNum % 10; //lastdigit retrieve
            decNum = decNum + (lastDigit * (int) Math.pow(2,pow)); //FORMULA
            pow++;
            binNum = binNum / 10; //last digit remove
        }
        System.out.println("Decimail of " + myNum + " = " + decNum);
    }

    public static void decToBin(int n){
        int myNum = n;
        int binNum = 0;
        int pow = 0;
        while(n > 0){
            int rem = n % 2; //to get reminder
            binNum = binNum + (rem * (int) Math.pow(10, pow));//FORMULA
            pow++;
            n=n/2; //dividing for furture iteration
        }
        System.out.println("Binary form of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        decToBin(5);
    }

}
