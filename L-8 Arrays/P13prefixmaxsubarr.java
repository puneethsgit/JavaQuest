public class P13prefixmaxsubarr {
    public static void printsubarrmax(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        //calculate prefix
        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        //maxsum
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is = "+ maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {-4,-2,-6,-2,-3};
        printsubarrmax(numbers);
    }
}
/* Time Complexity : O(n2) */