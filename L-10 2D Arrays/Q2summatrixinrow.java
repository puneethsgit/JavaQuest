/* calculate the sum of the numbers only in second row */
public class Q2summatrixinrow {
    public static int sumInarow(int array[][]){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[1][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int array[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(sumInarow(array));
    }
}
