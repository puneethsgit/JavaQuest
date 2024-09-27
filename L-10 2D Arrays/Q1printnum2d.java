/* Print the count of targe number in 2D array */
public class Q1printnum2d {
    public static int countNumber(int array[][], int target){
        int count = 0;
        for(int i=0; i<array.length; i++){
           for(int j=0; j<array[0].length; j++){
            if(target == array[i][j]){
                count++;
            }
           }
        }
        return count;
    }
    public static void main(String[] args) {
        int array[][] = {{4,7,8},{8,8,7}};
        int target = 7;
        System.out.println(countNumber(array, target));
    }
}
