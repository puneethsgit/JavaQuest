public class P8lastoccurence {
    public static int lastoccurence1(int arr[], int key, int i) {
        if(i == 0){
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return lastoccurence1(arr, key, i-1);
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastoccurence1(arr, 5, arr.length-1)); 
    }
}
