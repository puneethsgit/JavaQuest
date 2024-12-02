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
        int[] nums = {3,2,3,2,3};
        System.out.println(majorityElem(nums));
    }
}
