public class P5countsetbits {
    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){  //checks out LSB (same as odd even)
                count++;
            }
            n = n >> 1; //right shift 1 from which removes last digit
        }
       return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(10));
        System.out.println(countSetBits(15));
        System.out.println(countSetBits(16));
    }
}
