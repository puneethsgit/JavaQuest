public class P12Bruteforcemaxsubarr {
    public static void printSubarrmax(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;    
                currSum = 0; //reinitalize to zero
                for(int k=start; k<=end; k++){ 
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
               
            }
        }

        System.out.println("max sum = "+ maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        printSubarrmax(numbers);
    }
}

/* This approach is called Brute force approach and TC: O(n3), When it solves a probblem systematically trying all possible solution or combination  */