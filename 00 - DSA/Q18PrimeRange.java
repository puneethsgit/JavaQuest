public class Q18PrimeRange {
    public static void main(String[] args) {
        primeRange(50,100);
    }

    //primeRange
    public static void primeRange(int m, int n){
        for(int i=m; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    //isPrime
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
