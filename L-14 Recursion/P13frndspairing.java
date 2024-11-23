/* Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up. 
Input  : n = 3
Output : 4
Explanation:
{1}, {2}, {3} : all single
{1}, {2, 3} : 2 and 3 paired but 1 is single.
{1, 2}, {3} : 1 and 2 are paired but 3 is single.
{1, 3}, {2} : 1 and 3 are paired but 2 is single.
Note that {1, 2} and {2, 1} are considered same.
 */
public class P13frndspairing {
    public static int friendsPairing(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        //choice

        //single
        int fnm1 = friendsPairing(n-1);
        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totways
        int totways = fnm1 + pairWays;
        return totways;
    }

    public static int friendsPairing1(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        return friendsPairing1(n-1) + (n-1) * friendsPairing1(n-2);
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing1(3));
    }
}
