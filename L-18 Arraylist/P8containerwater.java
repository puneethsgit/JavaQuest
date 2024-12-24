/* Container with most water : for given n lines on x-axis use 2 lines to form a container such that it hold maximum water height=[1,8,6,2,5,4,8,3,7] */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class P8containerwater {

    //BruteForce Approach - O(n^2) [wrost case]
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        for(int i=0; i<height.size(); i++) {
            for(int j=i+1; j<height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j)); //min height
                int width = j - i; //indexes difference
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }

        return maxWater;
    }

    //2 pointer approach
    public static int mostWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp<rp) {
            int width = rp - lp;
            int ht = Math.min(height.get(lp), height.get(rp));
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            if(height.get(lp) < height.get(rp)) {
                lp++;
            }else {
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        Collections.addAll(height, 1, 8, 6, 2, 5, 4, 8, 3, 7);
        //System.out.println(storeWater(height));
        System.out.println(mostWater(height));
    }
}
