/* Although here we used for loop inside while loop but TC is Still O(n) because in while loop conside an element goes into stack and also comes out stack(pop()) so 2 time of n which 2n and now we have 2n + outer loop for loop n = 2n+n = 3n now ignore constant it will be O(n) */

import java.util.Stack;

public class P11nextgrtelem2 {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>(); //In stack we storing index of arr not the values
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) { //Backward loop
            //Step1: while loop
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {  //stack value index used
                s.pop(); //remove smaller element
            }

            //Step2: if-else
            if(s.isEmpty()) {
                nxtGreater[i] = -1;
            }else {
                nxtGreater[i] = arr[s.peek()]; //stack index value with arr
            }

            //Step3: push
            s.push(i);  //index push
        }
        for(int i=0; i<nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }

    
}

/* OTHER FORMS OF THIS PROBLEM ARE
1. NEXT GREATER IN RIGHT
2. NEXT GREATER IN LEFT : INTERCHANGE THE FOR LOOP START FROM STARTING
3. NEXT SMALLER IN RIGHT : WHILE LOOP CONDITION <= TO >=
4. NEXT SMALLER IN LEFT : FOR LOOP + WHILE LOOP
 */
