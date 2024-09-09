/* 
  * * * * *
  *       *
  *       *
  * * * * *
 */


public class P1Hollow {
    public static void hallow_rectangle(int totrow, int totcol){
        //outer loop (ROWS)
        for(int i=1; i<=totrow; i++){
            //inner loop (COLUMNS)
            for(int j=1; j<=totcol; j++){
                //cell (i,j)
                if(i==1 || i==totrow || j==1 || j==totcol){ //boundary condition
                    System.out.print("*"+ " ");
                }else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        hallow_rectangle(4, 5);
    }
}