public class P2checkoddeven {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        oddOrEven(2);
        oddOrEven(14);
        oddOrEven(8);
        oddOrEven(0);
        oddOrEven(3);
        oddOrEven(7);
    }
}
