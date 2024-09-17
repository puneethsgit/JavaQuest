public class P6binarysearch {
    public static int binarySearch(int num[], int key){
        int start = 0;
        int end = num.length-1; //array o index
        while(start<=end){
            int mid = (start+end) / 2;

            if(num[mid]==key){
                return mid;
            }else if(num[mid] > key){  //left half
                end = mid - 1;
            }else if(num[mid] < key){  //right half
                start = mid + 1;
            }
        }
        return -1; //if doesnt exits
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14};
        int key = 14;
        int index = binarySearch(num, key);
        System.out.println("Element found in the index: "+ index);
    }
}


/*
  if(num[mid]==key){
    return mid;
  }else if(num[mid] > key){  //left half
    end = mid - 1;
  }else{  //right half
    start = mid + 1;
  }
 */