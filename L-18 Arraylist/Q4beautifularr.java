/* An Arraylist nums of size n is beautiful if:
nums is a permutation of the integers in the range [1, n].
For every 0 <= i < j < n, there is no index k with i < k < j where 2 * nums.get(k) == nums.get(i) +
nums.get(j).
Given the integer n, return any beautiful arraylist nums of size n. There will be at least one valid
answer for the given n.
Sample Input 1 : n = 4
Sample Output 1 : [2,1,4,3]
Sample Input 2 : n = 5
Sample Output 2 : [3,1,2,5,4] */

import java.util.ArrayList;

public class Q4beautifularr {
    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1); //since array 1 to n permutation

        for(int i=2; i<=n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(Integer e : ans) {
                if(2 * e <= n) { //even num
                    temp.add(e*2);
                }
            }
            for(Integer e : ans) {
                if(2 * e - 1 <= n) { //odd num
                    temp.add(e*2-1);
                }
            }
            ans = temp;
        }
        return ans;
    }
    /* Approach 2 (Divide & Conquer)
Let's start from a simple 3 numbers case: (1, 2, 3) -> the only thing we need to do is move 2 out of 1 and 3 -> (1, 3, 2).Then what if the case is (1, 5, 9 ) which has increment = 4? It's the same thing -> move 3 out of 1 and 5 -> (1, 9, 5). Now, what if the case is (1, 3, 5, 7, 9) ? With the odd + even or divide + conquer idea in mind, we can simply divide it to (1, 5, 9) and (3, 7). Since no change is needed for the 2 numbers case, after following the above steps, we can conquer them to (1, 9, 5, 3, 7). */

    public static ArrayList<Integer> bArray(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        divideConque(1,1,res, n);
        return res;
    }

    private static void divideConque(int start, int increment, ArrayList<Integer> res, int n) {
        if(start + increment > n) { //baseCase
            res.add(start);
            return;
        }
        divideConque(start, 2* increment, res, n);
        divideConque(start + increment, 2 * increment, res, n);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(bArray(n));
    }
}
