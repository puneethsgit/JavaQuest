/* Check if problem can be solved and print only 1 solution to N queens problem (OPTIMIZATION) */
public class P6nqueenprintsol {
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

    public static boolean nQueens(char board[][], int row) {
        //basecase
        if(row == board.length) {
            return true;  //solution possible
        }

        //column loop
        for(int j=0; j<board.length; j++) {
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                if(nQueens(board, row+1)) { //if is it place n-1 queens means return true
                    return true;
                }
                //if not true then unplace the queen
                board[row][j] = 'X'; //backtracking step
            }
        }

        return false; //no possible solution
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
        int n = 2;
        char board[][] = new char[n][n];
        //initalize
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'X';
            }
        }
      
        if(nQueens(board, 0)) {
            System.out.println("Solution is Possible");
            printBoard(board);
        }else {
            System.out.println("Solution is Not Possible");
        }
   } 
    
}