/* 
  1 2 3 4 5
  1 2 3 4
  1 2 3
  1 2
  1                     //INVERTED HALF PYRAMID WITH NUMBER
 */


public class P3InvertHalfPyramind {
    public static void pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramid(5);
    }
}
