public class P3linearsearch {
    public static int linearSearch(int num[], int key){
        for(int i=0; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1; //false
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14,16};
        int key = 122;
        int index = linearSearch(num, key);
        if(index == -1){
            System.out.println("Not found !");
        }else{
            System.out.println("Key is at index : " + index);
        }
    }
}

/*
Explanation of Each Complexity:
Complexity	Name	                Example	                                    Performance
O(1)	    Constant Time	        Accessing an array element (arr[i])	        Fastest ✅
O(log n)	Logarithmic Time	    Binary Search	                            Very Fast ✅
O(n)	    Linear Time	            Looping through an array	                Moderate ⚡
O(n log n)	Quasilinear Time	    Merge Sort, Quick Sort (best/avg)	        Slower but efficient
O(n²)	    Quadratic Time	        Bubble Sort, Selection Sort	                Slow ❌
O(2ⁿ)	    Exponential Time	    Fibonacci (naive recursion)	                Very slow 😓
O(n!)	    Factorial Time	        Traveling Salesman Problem (Brute Force)    Worst 😵

*/