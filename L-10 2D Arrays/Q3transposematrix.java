/* Write a program to find Transpose of a matrix 
 What is Transpose ?
 Transpose of a matrix is the process of swapping the rows to colums (FOR A 2x3 MATRIX)
 */
public class Q3transposematrix {
    public static void printMatrix(int matrix[][]){
        System.out.println("The Matrix is :");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int matrix[][] = {{2,3,7},{5,6,7}};
        int row = matrix.length, col = matrix[0].length;

        //Display original matrix
        printMatrix(matrix);

        //Transpose the matrix
        int transpose[][] = new int [col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        //Display the transpose matrix
        printMatrix(transpose);
    }

}
