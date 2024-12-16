/* Given an array of integers Find the inversion count in the array
 INVERSIONCOUNT : For an array, inversion count indicates how far (or close) the array is from being sorted. if the array is already sorted then the inversion count is zero (0). if an array is sorted in the reverse order then inversion count is maximum formally for two elements a[i] and a[j] form an inversion if a[i] > a[j] and i<j
SAMPLE INPUT : N=5, arr[] = {2,4,1,3,5}
SAMPLE OUTPUT : 3 because it has 3 inversion = (2,1) (4,1) (4,3)



The pair (4, 2) is not considered an inversion because inversions are defined as pairs of elements (a[i], a[j]) such that a[i] > a[j] and i < j.

In your sample input array arr[] = {2, 4, 1, 3, 5}, the position of 2 is before 4 (i < j), but 2 is not greater than 4, so it doesn't meet the condition for being an inversion.

Here's the reasoning for the inversions in the given example:

(2, 1): 2 > 1 and index of 2 (0) is less than index of 1 (2).
(4, 1): 4 > 1 and index of 4 (1) is less than index of 1 (2).
(4, 3): 4 > 3 and index of 4 (1) is less than index of 3 (3).


 */
public class Q3inversioncount {

    
    
    //BruteForce Approach
    public static int getInvCount(int arr[]) { //a[i] > a[j] and i < j.
        int n = arr.length;
        int invCount = 0;

        for(int i=0; i<n -1; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] > arr[j]) {
                    invCount++;
                }
            }
        }
        return invCount;
    }


    //MergeSort Approach

    private static int merge(int arr[], int low, int mid, int high) {

        int inversionCount = 0;
      

        int left = low; //iterator for left
        int right = mid+1; //iterator for right
        int k = 0; //iterator for temp

        int temp[] = new int[high - low + 1];

        //Storing elements in the temporary array in a sorted manner
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
                //k++; left++;
            }
            else {  //right is smaller
                temp[k] = arr[right];
                inversionCount += (mid - left + 1);
                k++;
                right++;
            }
        }

        // if elements on the left half are still left

        while(left <= mid) {
            temp[k++] = arr[left++]; //post increment
        }

        // if elements on right half are still left

        while(right <= high) {
            temp[k++] = arr[right++]; //post increment
        }

        // transfering all elements from temp to arr

        for(int i=0; i<temp.length; i++) {
            arr[low+i] = temp[i];
        }

        return inversionCount;

    }

    private static int mergeSort(int arr[], int low, int high) {

        int inversionCount = 0;
    
        if(low >= high) { //Base Condition
            return inversionCount;
        }
       
        int mid = (low + high) / 2;

        inversionCount += mergeSort(arr, low, mid);
        inversionCount += mergeSort(arr, mid + 1, high);
        inversionCount += merge(arr, low, mid, high);

        return inversionCount;

    }
    public static int getInversion(int arr[]) {
        int n = arr.length;
        return mergeSort(arr,0,n-1);
    }
    
    public static void main(String[] args) {
        int arr[] = {5,3,2,4,1};
        System.out.println("Inversion Count = " + getInversion(arr));
    }
}
