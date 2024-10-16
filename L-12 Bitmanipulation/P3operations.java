public class P3operations {
    
    //Get ith Bit
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i; //creates a bitmask where only the i-th bit is 1, 
        /*if the bitmask is just bitMask = 1 means then it only check that 0 index LSB but when we use bitMask as 
        bitMask = 1<<i it actually checks the ith bit is 1 or 0*/
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

    //update ith Bit (APPROACH - 1)
    public static int updateIthBit(int n, int i, int newBit){
        if(newBit == 0){
           return clearIthBit(n, i);
        }else{
           return setIthBit(n, i);
        }
    }

    //update ith Bit (APPROACH - 2)
    public static int updateIthBit1(int n, int i, int newBit){
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    //clear last i bits
    public static int clearithBits(int n, int i){
        int bitMask = (~0) << 2;
        return n & bitMask;
    }

    //clear range of bits
    public static int clearBitsInRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearBitsInRange(10, 2, 4));
    }
}
