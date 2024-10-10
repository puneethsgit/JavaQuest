/*In insertion sort we will take a element from unsorted part and we place start comparing it with sorted part and then we will place it in the right position */
public class P3insertionsort {

    public static void insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // does temp variable work
            int prev = i - 1;

            // finding out the correct position to insert 
            // (prev >= 0 because prev-- so to avoid negative index)
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev]; //stored in sorted region
                prev--;
            }

            // inserting the element
            arr[prev + 1] = curr;  //data current value is stored
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, -3, 2 };
        insertionsort(arr);
        printArr(arr);
    }
}
