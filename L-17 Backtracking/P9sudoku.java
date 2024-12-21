/* write a function to complete a sudoko (decision backtracking) is yes/no if yes print one solution 
TIME COMPLEXITY : O(9 ^ 81)
This is the theoretical upper bound, but it is highly unlikely to reach this in practice due to early pruning when invalid configurations are encountered.
*/
public class P9sudoku {

   public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        //column
        for(int i=0; i<=8; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }

        //row
        for(int j=0; j<=8; j++) {
            if(sudoku[row][j] == digit) {
                return false;
            }
        }

        //grid 3x3
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;

        //3x3
        for(int i=sr; i<sr+3; i++) {
            for(int j=sc; j<sc+3; j++) {
                if(sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true; //safe
   }
   public static boolean sudokuSolver(int sudoku[][], int row, int col) {  
        //basecase
        if(row == 9) { //last row is 8 
            return true;
        }

        //recursion
        int nextRow = row, nextCol = col+1;
        if(col+1 == 9) {  //last col
            nextRow = row+1;
            nextCol = 0;
        }

        //already placed elements  Skip Filled Cells
        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextCol); //recursion call
        }

        //not placed elements
        for(int digit=1; digit<=9; digit++) {
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if( sudokuSolver(sudoku, nextRow, nextCol)) {  //solution exits
                    return true;
                }
                sudoku[row][col] = 0; //solution not exits place zero again backtracking
                /*This is a dead-end. For example, suppose the algorithm reaches a point where a certain cell has no valid numbers that can be placed due to conflicts in the row, column, or subgrid. */
            }
        }

        return false; //no solution
   }

   public static void printSudoku(int sudoku[][]) {
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
   }

   public static void main(String[] args) {
        int sudoku[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };

        if(sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exits");
            printSudoku(sudoku);
        }else {
            System.out.println("Solution does not exits");
        }
   } 
}
