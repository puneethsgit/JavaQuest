/* Give an integer arrays nums return true if any value appears atleast twice in the array and return false if element is distinct */

import java.util.HashSet;

public class Q1arrelemtwice {

    //APPROACH ONE BRUTE FORCE O(n2)
    public static boolean arrayCheck(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
               if(nums[i] == nums[j]){
                return true;
               }
            }
        }
        return false;
    }

    //APPROACH USING HASHSET O(n)
    public static boolean hashSet(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        //System.out.println("HashSet: " + set);
        return false;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(hashSet(nums));
    }
}
