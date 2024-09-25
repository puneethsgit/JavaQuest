public class Q1sorting {
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int maxPos = i;
            for(int j=i+1; j<arr.length;j++){ //loop only in unsorted part to get min
                if(arr[maxPos] < arr[j]){
                    maxPos = j;
                }
            }
            int temp=arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void countingSort(int arr[]){
        int length = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            length = Math.max(arr[i], length);
        }

        int count[] = new int[length+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++; 
        }

        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        countingSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
