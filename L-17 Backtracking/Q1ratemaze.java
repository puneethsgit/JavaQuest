/* Rat in a Maze
You are given a starting position for a rat which is stuck in a maze at an initial point (0, 0) (the
maze can be thought of as a 2-dimensional plane). The maze would be given in the form of a
square matrix of order N * N where the cells with value 0 represent the maze’s blocked
locations while value 1 is the open/available path that the rat can take to reach its destination.
The rat's destination is at (N - 1, N - 1).
Your task is to nd all the possible paths that the rat can take to reach from source to
destination in the maze.
The possible directions that it can take to move in the maze are 'U'(up) i.e. (x, y - 1) , 'D'(down)
i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y). 
(This problem is similar to Grid ways.) */
public class Q1ratemaze {
    //(Backtracking with Path Directions) (LEXICOGRAPHIC ORDER)


    private static void solve(int i, int j, int a[][], int n, String[] ans, int[] idx, String move, int vis[][]) {
        //BaseCase
        if(i == n-1 && j == n-1) {
            ans[idx[0]++] = move; //post increment
            return;
        }

        //downward
        if(i+1 < n && vis[i+1][j] == 0 && a[i+1][j] == 1) {
            vis[i][j] = 1; //visited marked 
            solve(i+1, j, a, n, ans, idx, move + 'D', vis);  //recursive call for next cell
            vis[i][j] = 0; //umarking cell visited array backtracking
        }

        //left
        if(j-1 >= 0 && vis[i][j-1] == 0 && a[i][j-1] == 1) {
            vis[i][j] = 1;
            solve(i, j-1, a, n, ans, idx, move + 'L', vis); 
            vis[i][j] = 0;
        }

        //right
        if(j+1 < n && vis[i][j+1] == 0 && a[i][j+1] == 1) {
            vis[i][j] = 1;
            solve(i, j+1, a, n, ans, idx, move + 'R', vis);
            vis[i][j] = 0;
        }

        //upward
        if(i-1 >= 0 && vis[i-1][j] == 0 && a[i-1][j] == 1) {
            vis[i][j] = 1;
            solve(i-1, j, a, n, ans, idx, move + 'D', vis);
            vis[i][j] = 0;
        }

    }

    public static String[] findPath(int[][] m, int n) {
        int vis[][] = new int[n][n]; //visited matrix track
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                vis[i][j] = 0;  //marked zero initialized
            }
        }

        //estimate maximum possible paths
        String[] ans = new String[1000]; //assuming max 1000 paths
        int[] idx = {0};  //index counter
        if(m[0][0] == 1) solve(0, 0, m, n, ans, idx, "", vis); //Solve function call

        //resize result to fit valid paths
        String[] result = new String[idx[0]];
        System.arraycopy(ans, 0, result, 0, idx[0]);
        return result;  
        
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] a = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};

        String[] res = findPath(a,n);

        if(res.length > 0) {
            for(String path : res) {
                System.out.print(path + " ");
                System.out.println();
            }
        }else {
            System.out.println(-1);
        }
    }

}
