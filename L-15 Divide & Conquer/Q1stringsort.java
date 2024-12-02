/**
Apply merge sort to sort the array of Strings (assume that all the characters in all the string are in lowercase)
 */
public class Q1stringsort {

    //function to mergeSort 2 arrays
    public static String[] mergeSort(String arr[], int lo, int hi) {
        if(lo == hi) {  //BaseCase (the array has only one element, and it’s already sorted. Return it as a single-element array.)
            String[] A = { arr[lo]};
            return A;
        }
        
        int mid = lo + (hi - lo) / 2;
        String[] arr1 = mergeSort(arr, lo, mid); //left part
        String[] arr2 = mergeSort(arr, mid+1, hi); //right part

        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m + n]; 

        int idx = 0;//pointer for arr3

        int i = 0;//pointer for arr1
        int j = 0;//pointer for arr2

        while (i < m && j < n) {
            if(isAlphabeticallySmaller(arr1[i],arr2[j])) {  //true - arr1 element added
                arr3[idx] = arr1[i];
                i++;
                idx++;
            }
            else { //false - arr2 element added
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }

        //adding left over elem in left side arr1
        while (i < m) {
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }
        
        //adding left over elem in right side arr2
        while (j < n) {
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }
        return arr3;
    }

    //return true if str1 appears before str2 in alphabetical order
    static boolean isAlphabeticallySmaller(String str1, String str2) { //lexicographical comparison
        if(str1.compareTo(str2) < 0) { // 0 : equal , below -1 : str1 smaller than str2 , 1 str1 greater than str
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury"};
        String[] res = mergeSort(arr, 0, arr.length-1);
        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    
}