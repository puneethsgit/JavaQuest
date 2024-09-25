import java.util.Arrays;
import java.util.Collections;

public class P4inbuiltsort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArr2(Integer arr[]){
        for(Integer i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2}; 
        Arrays.sort(arr);
        //printArr(arr);
        Integer arr2[] = {5,-4,1,3,2};
        Arrays.sort(arr2,Collections.reverseOrder());
        printArr2(arr2);
    }
}
