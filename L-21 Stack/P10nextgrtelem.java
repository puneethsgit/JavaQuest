/* The Next Greater element of Some element x in an array is the first greater element that is to the right of x in the same array
 arr = [6, 8, 0, 1, 3]
 next Greater = [8, -1, 1, 3, -1]
 */

 /* TC- O(n2) SC-O(n) */
public class P10nextgrtelem {

    //BRUTE FORCE APPROACH
    public static int[] nextGreater(int arr[]) {
        int newArr[] = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            newArr[i] = -1; // Default to -1 if no greater element is found
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[i]) {
                  newArr[i] = arr[j];  
                  break;
                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1,3};
        int res[] = nextGreater(arr);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
