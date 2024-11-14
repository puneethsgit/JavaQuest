
import java.util.Arrays;

public class P6countingsortneg {
    
    public static void countingSort(int arr[]) {
        // Find the minimum and maximum values
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        // Calculate the range of the input values
        int range = max - min + 1;

        // Create count array with size equal to the range of input values
        int count[] = new int[range];

        // Frequency count
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
        System.out.println(Arrays.toString(count));
        
        // Sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i + min; // Shift back to original value
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, -4, 1, 3, -2, 4, 3, -7};
        countingSort(arr);
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
