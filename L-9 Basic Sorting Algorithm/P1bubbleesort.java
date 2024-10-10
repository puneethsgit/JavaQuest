public class P1bubbleesort {

    /* In bubble sort we will compare the adjacent element and we will swap */
    public static void bubblesortt(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        bubblesortt(arr);
        printArr(arr);
    }

}

/*
 * OPTIMIZED BUBBLE SORT WITH TIME COMPLEXITY O(N) only for best case (1,2,3,4)
 * worst case O(n2)
 * public static void bubbleSort(int arr[]) {
 * for (int i = 0; i < arr.length - 1; i ++) {
 * boolean swapped = false; // This will track if any swaps occurred in this i
 * for (int j = 0; j < arr.length - 1 - i ; j++) {
 * if (arr[j] > arr[j + 1]) {
 * // Swap the elements
 * int temp = arr[j];
 * arr[j] = arr[j + 1];
 * arr[j + 1] = temp;
 * swapped = true; // A swap occurred
 * }
 * }
 * // If no swaps occurred during this entire pass, break out of the loop early
 * if (!swapped) {
 * break;
 * }
 * }
 * }
 */
