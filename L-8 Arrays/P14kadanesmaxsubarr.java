public class P14kadanesmaxsubarr {
    public static void kadanes(int numbers[]){
 
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
       
        for(int i=0; i<numbers.length; i++){
            currSum = currSum + numbers[i];

            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}
/* SPECIAL CASAE FOR ZERO
 
        // Handle the special case where all numbers are negative (CHECKING GREATER NEGATIVE NUMBER)
        int maxElement = Integer.MIN_VALUE;
        for (int num : numbers) { //enchanced loop : for each
            
            if (num > maxElement) {
                maxElement = num;
            }
        }       
            //LAST

        if (maxSum < maxElement) {
            maxSum = maxElement;
        } 

 */