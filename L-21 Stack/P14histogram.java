/* REFER NOTES
 Given an array of integer height representing the histograms bar height where the width of each bar is 1 return the area of the largest rectangle in the histogram.
 height = [2, 1, 5, 6, 2, 3] ans = 10
 */

import java.util.Stack;

public class P14histogram {
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //Next Smaller Right
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = arr.length; //-1 - n   
            }else {
                nsr[i] = s.peek(); 
            }
            s.push(i);
        }

        //Next Smaller Left
        s = new Stack<>();  //we used same stack by emptying in stack through new assignment

        for(int i=0; i<arr.length; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            }else{
                nsl[i] = arr[s.peek()];
            }
            s.push(i);
        }

        //Current Area : width = j-i-1 = nsr[i] - nsl[i] - 1
        for(int i=0; i<arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1; //important formula NEXT SMALLER RIGHT - NEXT SMALLER LEFT
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println("max area in historgram is = " + maxArea);

    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3}; //height in histogram
        maxArea(arr);
    }
}


//we know next greater element TC is O(n) even though nested loop for loop inside while reason we seen before only and here o(n)
//TC : O(n) becuase 3 loop 3n = ignore constant O(n)