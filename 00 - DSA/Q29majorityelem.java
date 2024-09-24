/* Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array. */

public class Q29majorityelem {

    //Brute Force Approach
    public static int majorityElement1(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            int freq = 0;

            for(int j=0; j<n; j++){
                if(nums[i] == nums[j]){
                    freq++;
                }
            }
            if(freq > n/2){
                return nums[i];
            }
        }
        return -1;
    }

    //Moore's Voting algorithm
    public static int majorityElement2(int nums[]){
        int n = nums.length;
        int freq=0, ans=0;
        for(int i=0; i<n; i++){
            if(freq == 0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                freq++;
            }else{
                freq--; 
            }
        } 

        //specialcase
        int count = 0;
        for(int val : nums){
            if(val == ans){
                count++;
            } 
        }

        if(count > n/2){
            return ans;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2,2,3,1,2};
        System.out.println(majorityElement1(nums));
    }
}
