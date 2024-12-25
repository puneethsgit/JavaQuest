/* An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An
Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise */

import java.util.ArrayList;
import java.util.Collections;

public class Q1Monotonic {

    public static boolean monotonic(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;

        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i) > list.get(i+1)) { //Monotonic Increasing Check:
                inc = false;
            }
            if(list.get(i) < list.get(i+1)) {  // Monotonic Decreasing Check:
                dec = false;
            }
        }
        return inc || dec; //both false return false
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,2,3);
        System.out.println(monotonic(list));
    }
}
