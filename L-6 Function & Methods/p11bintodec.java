public class p11bintodec {
    public static void main(String[] args) {
        binToDec(1110);
    }

    public static void binToDec(int binNum){
        int myNum = binNum;
        int decNum = 0;
        int pow = 0;
        while(binNum > 0){
            int lastDigit = binNum % 10; //lastdigit retrieve
            decNum = decNum + lastDigit * (int) Math.pow(2,pow);
            pow++;
            binNum = binNum / 10; //last digit remove
        }
        System.out.println("Decimail of " + myNum + " = " + decNum);
    }

}