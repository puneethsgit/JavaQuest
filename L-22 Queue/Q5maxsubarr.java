/* 
Maximum of all subarrays of size k
We have an array arr[] of size N and an integer K. Find the maximum for each and every
contiguous subarray of size K.
Sample Input 1 : N=9, K=3 arr= 1 2 3 1 4 5 2 3 6
Sample Output 1 : 3 3 4 5 5 5 6 */

/* Explanation of the Sample Input:
   - Input: ( N = 9 ), ( K = 3 ), ( arr = [1, 2, 3, 1, 4, 5, 2, 3, 6] )
   - Break the array into contiguous subarrays of size ( K = 3 ):
     - Subarray 1: ( [1, 2, 3] ) → Maximum = 3
     - Subarray 2: ( [2, 3, 1] ) → Maximum = 3
     - Subarray 3: ( [3, 1, 4] ) → Maximum = 4
     - Subarray 4: ( [1, 4, 5] ) → Maximum = 5
     - Subarray 5: ( [4, 5, 2] ) → Maximum = 5
     - Subarray 6: ( [5, 2, 3] ) → Maximum = 5
     - Subarray 7: ( [2, 3, 6] ) → Maximum = 6
   - **Output**: ( [3, 3, 4, 5, 5, 5, 6] )
 */

import java.util.Deque;
import java.util.LinkedList;

public class Q5maxsubarr {

    static void printMax(int arr[], int n, int k) {
        // A Deque (Double ended queue) to store indices of the array elements
        // it will help in maintianing the maximum of the current window effectively
        Deque<Integer> dq = new LinkedList<>();
        int i;

        // process for the first 'k' elements
        /*
         * The increment operation in a for loop (i++ or ++i) happens at the end of each
         * iteration, not during the loop condition check or execution of the loop body.
         * Whether you use i++ or ++i, the value of i after the increment is the same
         * before the next iteration begins.
         */
        for (i = 0; i < k; ++i) {
            // remove all elements smaller than the current element from the back of dequeue
            // since they will not be the maximum for this or any subsequent window
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            // add the current element index of the deque
            dq.addLast(i);
        }

        // process the rest of the element in the array
        for (; i < n; i++) {
            // The element at the front of the deque is the largest element of the previous
            // window
            System.out.print(arr[dq.peek()] + " ");

            // remove the element that are outside the current window
            while ((!dq.isEmpty()) && dq.peek() <= i - k) {
                dq.removeFirst();
            }

            // remove all elements smaller than the current element from the back of the
            // deque since they will not be the maximum for this or any subsequent window
            while ((!dq.isEmpty()) && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }

            // Add the current element index to the deque
            dq.addLast(i);

        }
        // Print the maximum element of the last window
        System.out.print(arr[dq.peek()]);
    }

    public static void main(String[] args) {
        int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
        int k = 3;
        printMax(arr, arr.length, k);
    }
}
