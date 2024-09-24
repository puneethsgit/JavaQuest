/* Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation. */

import java.util.Arrays;

public class Q30productofarr {

    //Brute Force Approach TC:O(n2)
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
    //prefix suffix TC-O(3n) SC-O(n)
    public static int[] productExceptSelf2(int nums[]){
        int n = nums.length;
        //prefix
        int prefix[] = new int[n];
        prefix[0] = 1;
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        //suffix
        int suffix[] =  new int [n];
        suffix[n-1] = 1; 
        for(int i=n-2; i>=0; i-- ){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        //answer
        int answer[] = new int[n];
        for(int i=0; i<n; i++){
            answer[i] = prefix[i] * suffix[i];
        }
     return answer;   
    }

    //prefix suffix TC-O(3n) SC-O(1)
    public static int[] productExceptSelf(int nums[]){
        int n = nums.length;
         int answer[] = new int[n];
         Arrays.fill(answer,1);

        //prefix directly stored in answer
        for(int i=1; i<n; i++){
            answer[i] = answer[i-1] * nums[i-1];
        }

        //suffix
        int suffix=1;
        for(int i=n-2; i>=0; i-- ){
           suffix *= nums[i+1];
           answer[i] *= suffix;
        }
     return answer;   
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int answer[] = productExceptSelf(nums);
        // for(int i=0; i<answer.length;i++){
        //     System.out.print(answer[i] + " ");
        // }
        System.out.println(Arrays.toString(answer));
    }
}
