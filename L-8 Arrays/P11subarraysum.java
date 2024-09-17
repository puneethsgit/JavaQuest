public class P11subarraysum {
    public static void printSubarrays(int numbers[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;  //-213
        int minSum = Integer.MAX_VALUE;  //213
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;    
                for(int k=start; k<=end; k++){ //for print
                    System.out.print( numbers[k] + " ");
                    sum += numbers[k];
                    if(sum > maxSum){
                        maxSum = sum;
                    }
                    if(sum < minSum){
                        minSum = sum;
                    }
                }
                System.out.println("sum : "+sum);
                System.out.println();
                sum=0;
            }
            System.out.println();
           
        }
        System.out.println("MaxSum : "+ maxSum);
        System.out.println("MinSum : "+minSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        printSubarrays(numbers);
    }
}
