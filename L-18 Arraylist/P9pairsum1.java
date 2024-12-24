/* Find if any pair in a sorted Arraylist has a target sum
 list = [1,2,3,4,5] target=5
 */

import java.util.ArrayList;
import java.util.Collections;

public class P9pairsum1 {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i) + list.get(j) == target) {
                    return true;
                } 
            }
        }
        return false; //no pair exits
    }

    public static boolean twoPointer(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp) {  //or while(lp<rp)
            //case 1
            if(list.get(lp)+list.get(rp) == target) {
                return true;
            }
            //case 2 
            if(list.get(lp)+list.get(rp) < target) {
                lp++;
            } else {  //case 3 > target
                rp --;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        int target = 15;

        System.out.println(twoPointer(list, target));
    }
}
