/*
For a given integer array of size n. you have to find all the occurances(indices) of the given element (key) and print them use recursive funcction to solve this problem
 */
public class Q1keyindex {

    public static void printIndexs(int arr[],int key, int i) {
        if(i == arr.length) {
            return;
        }
        if(arr[i] == key) {
            System.out.print(i + " ");
        }
        printIndexs(arr, key, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        printIndexs(arr, key, 0);
    }
}
