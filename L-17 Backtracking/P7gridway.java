/* In a Grid Find the number of ways to reach from source (0,0) to destination (n-1,m-1) in nxm grid allowed moves right or down  */
public class P7gridway {
    public static int gridWays(int i, int j, int n, int m) {
        //baseCase
        if(i == n-1 && j == m-1) { //condition for last cell
            return 1;
        } else if(i == n || j == m ){ //cornercase boundary cross 
             return 0;
        }

        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1+w2;

    }

    public static void main(String[] args) {
        int n = 3, m = 3;
       System.out.println(gridWaysTrick(n, m));
    }
}

//TC - O(2^n+m)