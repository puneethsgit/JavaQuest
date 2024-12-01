public class P2quicksort {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if(si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei);  //sort L & R and also place pivot to right position
        quickSort(arr, si, pIdx-1); //Left
        quickSort(arr, pIdx+1, ei); //right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1; //to make place for element smaller than pivot

        for(int j=si; j<ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //to place pivot on right position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i; //pivot index
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
