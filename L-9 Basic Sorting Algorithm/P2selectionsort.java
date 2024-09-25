/* In selection sort we will take the minimum(or maximum for DESC) value and we will place it in the begining for array */
public class P2selectionsort {
    
    //TC-O(n2) but it reduces unnecessary swaping   
    public static void selectionSort(int arr[]){
         for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){ //arr[j] < arr[minPos]
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
