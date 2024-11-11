public class P8reversearray2 {
    public static void reverseArray(int[] num) {
        int n = num.length-1;
        for (int i = 0; i < n / 2; i++) {
            // Swap elements at positions i and (n - i - 1) or (n-i)
            int temp = num[i];
            num[i] = num[n - i ];
            num[n - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10};
        reverseArray(num);

        // Print the reversed array
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
