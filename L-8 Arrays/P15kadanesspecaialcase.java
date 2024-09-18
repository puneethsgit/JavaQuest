public class P15kadanesspecaialcase {
    public static void kadanes(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        boolean hasPositive = false;

        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];

            if (currSum < 0) {
                currSum = 0;
            }

            if (numbers[i] > 0) {
                hasPositive = true;
            }

            maxSum = Math.max(currSum, maxSum);
        }

        if (!hasPositive) {
            maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < numbers.length; i++) {
                maxSum = Math.max(maxSum, numbers[i]);
            }
        }

        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
}
