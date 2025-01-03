/* Place N queens on an N*N chessboard such that no 2 queens can attack each other */
public class P4nqueens {

    public static boolean isSafe(char board[][], int row, int col) {  //col-j
        //vertical up [row i need to decrease col j contant (i--)]
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diagonal left up [i and j both minums (i-- & j--)]
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //diagonal right up [i-1 & j+1]
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true; 
    }

    public static void nQueens(char board[][], int row) {
        //basecase
        if(row == board.length) {
            printBoard(board);
            return;
        }

        //column loop
        for(int j=0; j<board.length; j++) {
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1); //recursive calls
                board[row][j] = 'X'; //backtracking step
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("-----------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

   public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        //initalize
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'X';
            }
        }
      
        nQueens(board,0);
   } 
}
