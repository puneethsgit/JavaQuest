import java.util.Scanner;

public class Q22minval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        // Initialize the array
        int[] numbers = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Find the minimum value
        int minValue = numbers[0]; // Assume first element is the smallest
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i]; // Update minValue if a smaller value is found
            }
        }

        // Output the minimum value
        System.out.println("The minimum value in the array is: " + minValue);
        sc.close();
    }
    
}
/*  public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 6};
        int min = findMinValue(numbers);
        System.out.println("Minimum value: " + min);
    }

    public static int findMinValue(int[] array) {
        // Initialize min with the first element of the array
        int min = array[0];

        // Iterate through the array to find the minimum value
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }

        return min;
 } */