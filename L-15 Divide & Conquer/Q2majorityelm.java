/* Given an array of size n, return the majority element. The majority element is the element that appears more than [n/2] times. you may assume that the majority element always exists in an array
 Example: arr[3,2,3] - output: 3
 */
public class Q2majorityelm {

    //BruteforceApproach - TC O(n^2)
    public static int majorityElement(int[] nums ) {
        int majorityCount = nums.length / 2;
        for(int i=0; i<nums.length; i++) {
            int count = 0;
            for(int j=0; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count += 1; //count incremented
                }
            }
            if(count > majorityCount) {
                return nums[i];
            }
        }
        return -1;
    }

    //DivideAndConquer Approach - TC O(nxlogn)
    /* Idea : if we know that majority element in the left and right halves of an array, we can determine which is the global majority element in linear time 
     
    here we apply a classical divide and conquer approacah that recurses on the left and right halves of an array until an answer can be trivially achieved for a length-1 array. Note that because actually passing copies of subarrays costs time and space, we instead pass lo and hi indices that describe the relevant slice of the overall array. in this case the majority element for a length-1 slice is trivially its only element, so the recursion stops there if the current slice is longer than length-1, we must combine the answers for the slice left and right halves if they agree on the majority element then the majority element for the overall slice is obviously the same. if they disagree only one of them can be "right " so we need to count the occurrences of the left and right majority element to determine which subslice answer is globally correct the overall answer for the array is thus the majority element between indices O and n.
     */

    private static int countInRange(int nums[], int num, int lo, int hi) {
        int count = 0;
        for(int i=lo; i<=hi; i++) {
            if(nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private static int majorityElementRec(int[] nums, int lo, int hi) {
        //baseCase the only element in an array of size 1 is the majority element
        if(lo == hi) {
            return  nums[lo];
        }

        //recurse on left and right halves of this slice
        int mid = (hi-lo) / 2 + lo; 
        int left =  majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid+1, hi);

        //if the two halves agree on the majority element, return it
        if(left == right) {
            return left;
        }

        //otherwise, count each element and return the winner   
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    public static int majorityElem(int[] nums) {
        return majorityElementRec(nums, 0, nums.length-1);
    }

    
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(majorityElem(nums));
    }
}

/* The brute force approach can comfortably handle around 1 million iterations in 1 second, which corresponds to n = 1,000.
For larger values like n = 10,000, it will take around 100 million iterations, which may take several seconds.
n = 50,000 would require 2.5 billion iterations, which is not feasible in 1 second on typical hardware. For such large values of n, the brute force approach would take too long and is impractical. 
n == nums.length:

The approach uses nums.length to define the size of the array and to calculate the majority count. It satisfies this condition since the logic directly depends on the length of the array.
1 <= n <= 5 * 10^4:

The brute force approach has a time complexity of O(n^2) because it uses two nested loops to count occurrences for each element.
If n can go up to 50,000 (i.e., 5 * 10^4), the approach could potentially take up to 50,000^2 iterations (i.e., 2.5 billion iterations), which is very inefficient for large arrays.
Does this satisfy the constraint? No, the brute force approach is inefficient for large values of n (up to 50,000) because of the quadratic time complexity.
-109 <= nums[i] <= 109:

The approach does not depend on the actual values of the elements in the array other than comparing them. As long as the elements are integers within the specified range, the approach will work.
Does this satisfy the constraint? Yes, the approach will work for all integer values in the range of -109 to 109 because it simply compares the elements without performing any arithmetic operations that would be affected by the range. */