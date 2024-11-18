public class P8lastoccurence {
    public static int lastoccurence1(int arr[], int key, int i) {
        if(i == -1){ //i<0
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return lastoccurence1(arr, key, i-1); //--i
    }

    public static int lastoccurence(int arr[], int key, int i) {
        //basecondition
        if(i == arr.length) {
            return -1; 
        }

        //recursion call
        int isFound = lastoccurence(arr, key, i+1); 

        //checkwithself
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastoccurence(arr, 5,0)); 
    }
}

/* After the key is found at index 7, the function returns 7 (the index of the key).
This 7 is the return value that gets passed back to the 7th return (i = 6). */