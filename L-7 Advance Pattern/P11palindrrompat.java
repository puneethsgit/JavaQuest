public class P11palindrrompat {
    
    public static void palindromepat(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //num descending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //num ascending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        palindromepat(5);
    }
}
