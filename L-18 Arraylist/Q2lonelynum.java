/*You are given an integer arraylist nums. A number x is lonely when it appears only once, and
no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
Return all lonely numbers in nums. You may return the answer in any order.
Sample Input 1 : nums = [10,6,5,8]
Sample Output 1 : [10,8]
Explanation :
- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
- 5 is not a lonely number since 6 appears in nums and vice versa.
Hence, the lonely numbers in nums are [10, 8].
Note that [8, 10] may also be returned. */

import java.util.ArrayList;
import java.util.Collections;

public class Q2lonelynum {
    //brute force O(n2)
    public static ArrayList<Integer> lonely(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<list.size(); i++) {
            int currNum = list.get(i);
            int currIn = list.get(i) + 1;
            int currDe = list.get(i) - 1; 
            //Collections.frequency checks for the repeations
            if(Collections.frequency(list, currNum) == 1 && !list.contains(currIn) && !list.contains(currDe) ) {
                result.add(currNum);
            }
        }
        return result;
    }
    /* You're right! In the second solution, you are using a single loop, but the issue comes from the use of Collections.frequency() and list.contains(), which are each called inside the loop and have their own time complexities. Here's why the overall time complexity becomes O(n2) */

    public ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);  // Step 1
        ArrayList<Integer> list = new ArrayList<>();  // Step 2
        
        // Step 3: Loop through the list from the second element to the second last element
        for (int i = 1; i < nums.size() - 1; i++) {
            // Check if the current number is not adjacent to the previous or next number
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));  // Add the lonely number to the list
            }
        }
    
        // Step 4: Handle edge case when there's only one element
        if (nums.size() == 1) {
            list.add(nums.get(0));  // If there's only one number, it's automatically lonely
        }
    
        // Step 5: Handle edge cases for the first and last elements
        if (nums.size() > 1) {
            // Check if the first number is not adjacent to the second
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));  // Add the first number if it's lonely
            }
            
            // Check if the last number is not adjacent to the second last
            if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
                list.add(nums.get(nums.size() - 1));  // Add the last number if it's lonely
            }
        }
        
        return list;  // Step 6: Return the list of lonely numbers
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 5, 3);
        System.out.println(lonely(list));
    }
}
