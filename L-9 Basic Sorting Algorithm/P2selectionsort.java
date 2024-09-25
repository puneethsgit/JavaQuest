public class P2selectionsort {
    
    //TC-O(n2) but it reduces unnecessary swaping   
    public static void selectionSort(int arr[]){
         for(int i=0; i<=arr.length-2; i++){
            int minPos = i;
            for(int j=i; j<=arr.length-1; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
         }
    }
    
    
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2}; 
        selectionSort(arr);
        printArr(arr);
    }
}
