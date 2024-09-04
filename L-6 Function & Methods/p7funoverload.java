public class p7funoverload {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
    }

    public static int sum (int a, int b){
        return a + b;
    }

    public static float sum (int a, int b, int c){
        return a + b + c;   
    }
}
