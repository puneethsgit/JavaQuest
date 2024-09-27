public class P4staircasesearch {
    public static boolean stairCaseSearch(int matrix[][], int key){
        //here we are taking starting index as (0,m-1) we can also take (n-1,0)
        int row = 0, col = matrix.length-1;
        while(row < matrix.length && col >= 0){
            if(key == matrix[row][col]){
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){//move left 
                col--;
            } 
            else{ //if(key > matrix[row][col]) move bottom
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 323;
        stairCaseSearch(matrix, key);
    }
}
