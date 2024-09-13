/*
         * * * * * 
      *       * 
    *       * 
  *       * 
* * * * * 
 */
public class P8hollowrhombus {
    
    public static void hollowrhombus(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" "+" ");
            }
            //star
            for(int j=1; j<=n; j++){
               if(i==1 || i==n || j==1 || j==n){
                System.out.print("*"+" ");
               }else{
                System.out.print(" "+ " ");
               }
            }
            //nextline  
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowrhombus(5);
    }
}
