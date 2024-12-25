/* Find if any pair in a sorted and rotated arraylist has a target sum */

import java.util.ArrayList;
import java.util.Collections;

public class P10pairsum2 {
    //Bruteforce
    public static boolean bfPairsum(ArrayList<Integer> list, int target) {
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i)+list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean pairsums(ArrayList<Integer> list, int target) {
        int n = list.size();
        int bp = -1; //breaking point initalized to -1
        for(int i=0; i<n; i++) {
            if(list.get(i) > list.get(i+1)) { //breaking point
                bp = i;
                break; //exit from loop
            }
        }

        int lp = bp+1; //smallest
        int rp = bp; //largest

        while(lp != rp) {
            //case1
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }
            //case2
            if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1) % n;
            }else {
                //case3
                rp = (n+rp-1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 11, 15, 6, 8, 9, 10);
        int target = 16; 
        System.out.println(pairsums(list, target));
    }
}
