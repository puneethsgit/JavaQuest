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
/* USING ONLY BINARY SEARCH  
 public static boolean binarySearchMatrix(int[][] matrix, int key) {
        int n = matrix.length;
        if (n == 0) return false;
        int m = matrix[0].length;

        int left = 0, right = n * m - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Convert mid to 2D matrix indices
            int row = mid / m;
            int col = mid % m;

            // Check if the mid element is the key
            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + ", " + col + ")");
                return true;
            } else if (matrix[row][col] < key) {
                // Move right in the flattened array
                left = mid + 1;
            } else {
                // Move left in the flattened array
                right = mid - 1;
            }
        }
        System.out.println("Key not found");
        return false;
    } */