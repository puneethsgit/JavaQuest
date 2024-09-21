/* Give an integer arrays nums return true if any value appears atleast twice in the array and return false if element is distinct */
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
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,1};
        System.out.println(arrayCheck(nums));
    }
}
