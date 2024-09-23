/* Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation. */

import java.util.Arrays;

public class Q6productofarr {

    //Brute Force Approach
    public static int[] productExpectSelf1(int nums[]){
        int n = nums.length;
        int answer[] = new int[n];
        Arrays.fill(answer,1); //initializing array with [1,1,1,1] rather than [0,0,0,0]
        for(int i=0; i<n; i++){;
            for(int j=0; j<n; j++){
               if(i != j){
                    answer[i] *= nums[j]; //answer[i] = ans[i] * nums[j]
               }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int answer[] = productExpectSelf1(nums);
        // for(int i=0; i<answer.length;i++){
        //     System.out.print(answer[i] + " ");
        // }
        System.out.println(Arrays.toString(answer));
    }
}
