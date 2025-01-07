/* Asked in microsoft, amazon, adobe, flipkart, samsung STOCK SPAN Probelem Given graph for 7 days of stock [100,80,60, 70, 60, 85, 100] span is the maximum number of consecutive days for which price <= today price
 FORMULA = i - prev High Index
 time complexity woould be O(n2) because one loop to iterate n-1 and another one loop to calculate the prev high index
 but will solve this on O(n) using STACK REFER NOTES
 */

import java.util.Stack;

public class P9stockspam {

    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();

        //for 1st day 0th index is always will be 1 , Span for the first day is always 1
        span[0] = 1;
        s.push(0);

        for(int i=1; i<stocks.length; i++) { //loop for every days
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice >= stocks[s.peek()]) {  //curr > stack index + stock arr
                //until we find big element than currprice we will be removing smaller element
                s.pop();               
            }
            
            if(s.isEmpty()){ //checking is stack is empty
                span[i] = i+1;
            }else {  //when we found prev high value
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
           
            s.push(i); //index pushed in stack
        }

    }
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for(int i=0; i<span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
