public class Q17Binocoef {
    public static void main(String[] args) {
        System.out.println(bionomialFact(5, 2));
    }

    public static int bionomialFact(int n, int r){
      return factorial(n) / (factorial(r)*(factorial(n-r)));
    }

    
    public static int factorial(int num){
        int f=1;
        for(int i=1; i<=num; i++){
            f *= i; //fact = fact * i
        }
        return f;
    }
}
