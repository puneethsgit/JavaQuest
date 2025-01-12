/* We have an array of N non-negative integers arr[] representing an elevation map where the
width of each bar is 1, compute how much water it is able to trap after raining.
SOLVE USING STACK
Sample Input 1 : [7 0 4 2 5 0 6 4 0 6]
Sample Output 1 : 25 */

/* Difference between traping water and container with most water is traping water is bar where water can be stored between 2 bars and container with most water here it is of single line 2 makes a container and which container has holds more water container starts from 0 to line height but in traping water it based on bar water cant 0 water can be stored on top of bar that is between bars */

import java.util.Stack;

public class Q5trapingwater {

    public static int maxWater(int height[]) {
        int n = height.length;
        if (n == 0) return 0;
        
        Stack<Integer> stack = new Stack<>();
        int trappedWater = 0;
        
        for (int i = 0; i < n; i++) {
            // While the current height is greater than the height at the top of the stack
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                // Pop the top of the stack and calculate the trapped water
                int top = stack.pop();
                
                // If the stack is empty, there is no left boundary for trapping water
                if (stack.isEmpty()) break;
                
                // Calculate the width between the current index and the new top of the stack
                int width = i - stack.peek() - 1;
                
                // Calculate the height of the water trapped, which is determined by the minimum of the left and right boundaries
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];
                
                // Add the trapped water to the total
                trappedWater += width * boundedHeight;
            }
            
            // Push the current index to the stack
            stack.push(i);
        }
        
        return trappedWater;
    }

    public static void main(String[] args) {
        int arr[] = {7, 0, 4, 2, 5, 0, 6, 4, 0, 6};
        System.out.println(maxWater(arr));
    }
}
