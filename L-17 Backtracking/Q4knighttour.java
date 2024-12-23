public class Q4knighttour {
    //private static final int rowMoves[] = {-2, -1, 1, 2, 2, 1, -1, -2};
    //private static final int colMoves[] = {1, 2, 2, 1, -1, -2, -2, -1};

    private static final int rowMoves[] = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int colMoves[] = {1, 2, 2, 1, -1, -2, -2, -1};

    /* This method checks if a move is safe for the knight, meaning The move is within the bounds of the chessboard (i.e., the row and column are not out of range). The square has not been visited before (indicated by the value -1). */
    public static boolean isSafe(int board[][], int row, int col) {
        return (row >= 0 && col >= 0 && row < board.length && col < board.length && board[row][col] == -1);
    }

    //knight tour
    public static boolean knightTour(int board[][], int currRow, int currCol, int moveCount) {
        // BaseCase if all squares are visited
        if(moveCount == board.length * board.length) {
            return true;
        }

        //Try all next moves from the current position
        for(int i=0; i<8; i++) {
            int newRow = currRow + rowMoves[i];
            int newCol = currCol + colMoves[i];

            if(isSafe(board, newRow, newCol)) {
                board[newRow][newCol] = moveCount;
                if(knightTour(board, newRow, newCol, moveCount + 1)) {
                    return true;
                }
                //backtracking step
                board[newRow][newCol] = -1;
            }
        }
        return false;
    }

    public static void printBoard(int board[][]) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5; //size of chess board
        int board[][] = new int[n][n];

        // Initialize the board with -1 (indicating unvisited squares)
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = -1;
            }
        }

        // Start the knight from the first square (0, 0)
        board[0][0] = 0;

        // Start the knight tour
        if(knightTour(board, 0, 0, 1)) {
            printBoard(board);
        }else {
            System.out.println("Solution does not exist");
        }
    }
}
