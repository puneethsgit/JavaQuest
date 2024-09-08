public class Q23lengthmethod {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50,23,41,2,1,2,1};  // Example array

        // Count array size manually
        int count = 0;
        try {
            while (true) {
                int temp = array[count];  // Try accessing each index
                count++;  // Increment counter if successful
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Exception will be caught when we reach the end of the array
        }

        System.out.println("The size of the array is: " + count);
    }
}
