public class P5largenum {

    //largest number
    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE; // -infinity -> -2147483648
        int smallest = Integer.MAX_VALUE; // infinity  -> 2147483647
        for(int i=0; i<num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
            if(smallest > num[i]){
                smallest = num[i];
            }
        }
        System.out.println("smallest value is: "+ smallest); 
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("largest value is : " + getLargest(numbers));
    }
}
