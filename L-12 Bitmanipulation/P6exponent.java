public class P6exponent {
    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n > 0){ 
            if((n & 1) != 0){ //checks LSB
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;  //right shift from which removes the last digit
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExpo(3, 5));
    }
}
/* NOTE : In Binary number index starts from right hand side (0) not from LHS as array and string */