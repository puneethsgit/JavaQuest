public class P4sumnatural {
    public static int sumNatural(int n) {
        if(n==1){
            return 1;
        }
        int sum = n + sumNatural(n-1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumNatural(5));
    }
}
