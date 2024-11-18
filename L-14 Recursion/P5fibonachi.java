public class P5fibonachi {
    public static int fibofn(int n) {
        //Base Case
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        //Recursive calling
        int fib = fibofn(n-1) + fibofn(n-2);
        return fib;
    }

    public static int fib(int n) {  
        if(n==0 || n==1) {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(fib(23));
    }
}
