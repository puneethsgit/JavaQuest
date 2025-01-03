public class P1mergesort {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if(si >= ei) { //basecase
            return;
        }
        int mid = si + (ei - si)/2; //(si+ei)/2
        mergeSort(arr, si, mid); //left part sort
        mergeSort(arr, mid+1, ei); //right part sort
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        //left(0,3) = 4 right(4,5) = 2 -> 5-0+1 = 6
        int temp[] = new int[ei-si+1];//+1 array index zero start
        int i = si; //iterator for left part 
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp arr

        //--comparing arrays & assigning in temp arr--
        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) { //left array lesser than right array
                temp[k] = arr[i];
                i++;
            }else {
                temp[k] = arr[j]; 
                j++;
            }
            k++;
        }


        //--adding leftover elements
        //left-part left over element
        while(i <= mid) {
            temp[k++] = arr[i++]; //directly written post increment first use then increment
        }

        //right-part left over element
        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original arr
        for(k=0, i=si; k<temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }


    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
