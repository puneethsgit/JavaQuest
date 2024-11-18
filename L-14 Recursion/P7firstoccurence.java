/*WAF to find the first occurenace of an element in an array     */
public class P7firstoccurence {
    public static int firstOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key){
            return i; //return index 
        }
        return firstOccurence(arr, key, i+1);
    }
    
    public static int firstOccurence1(int arr[], int key, int i) {
        if(i > arr.length) {
            return -1;
        }
        if(arr[i] == key){
            return i; //return index 
        }
        return firstOccurence(arr, key, i++); //or ++i
    }


    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurence1(arr, 5, 0));
    }
}


/* NOTE

Difference Between i++ and ++i
i++ (Post-Increment): The current value of i is passed to the function, and then i is incremented afterward.
++i (Pre-Increment): i is incremented first, and then the incremented value is passed to the function.

i++ :-
When i++ is used in the recursive call, the current value of i is passed to the next function call, and then i is incremented afterward.
The key detail is that each recursive call operates in its own stack frame, and i in the caller's stack frame is independent of the i in the callee's stack frame.
Thus, each stack frame effectively gets the "correct" incremented value of i for subsequent recursive calls, even though this behavior is unintuitive and error-prone.

Comparison Summary
Behavior	Key Found (Index 4)	Key Not Found (Stack Overflow)
i++ (Post-Inc)	5 Calls	11 Calls
++i (Pre-Inc)	5 Calls	10 Calls

 1. First version: i++
return firstOccurence(arr, key, i++);  so in Basecondition need to use i > arr.length-1
Behavior: Here, the post-increment operator (i++) is used. This means the current value of i is passed to the function, and then i is incremented after the value is passed.
Problem: This will lead to infinite recursion because the value of i does not actually change for the subsequent recursive calls (the increment happens only after the value is passed). The function effectively keeps passing the same value of i, causing it to get stuck.

2. Second version: i+1
return firstOccurence(arr, key, i+1);
Behavior: Here, i+1 explicitly passes the incremented value to the function. This ensures that the value of i increases with every recursive call.
Result: This is the correct version, as the function will eventually reach the base case (i == arr.length) when i exceeds the array bounds.
 */