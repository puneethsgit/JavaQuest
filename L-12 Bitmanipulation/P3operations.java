public class P3operations {
    
    //Get ith Bit
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i; //creates a bitmask where only the i-th bit is 1,
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    //Set ith Bit
    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    //Clear ith Bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
    }
}
