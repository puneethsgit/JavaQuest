/* CONECT N ROPES WITH MINIMUM COST

Given are N ropes of different lengths, the task is to connect these ropes into one rope with minumum cost, such that the cost to connect two ropes is equal to sum of their length

EXAMPLE 1 :input :N=4, arr=[4,3,2,6]
Process:Initialize min-heap: [2,3,4,6]
Pick the two smallest ropes: 2,3 Cost = 2+3=5 Add back: [4,5,6] 
Pick the two smallest ropes: 4,5 Cost = 4+5=9 Add back: [6,9]
Pick the two smallest ropes: 6,9 Cost = 6+9=15 Add back: [15]
Total Cost: 5+9+15=29 Output: 29 */


/* HERE WE ARE USING PRIORITY QUEUE 
Use Queue when you need a simple FIFO mechanism.
Use PriorityQueue when you need elements to be processed based on priority, not insertion order.
Queue: The head of the queue is simply the first element that was added.
PriorityQueue: The head of the queue is the smallest (or highest-priority) element.


If you want the highest value instead of the lowest value in a PriorityQueue, you can use a custom comparator when creating the PriorityQueue. By default, PriorityQueue in Java is a min-heap, meaning the smallest value is at the head. A custom comparator can reverse the order, making it behave as a max-heap.
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

.poll() -> In Queue Removes and returns the head of the queue
.poll() -> In priority Queue The "head" of a PriorityQueue is the smallest element (for a min-heap, which is the default) and it removes and return the head. if queue is empty return null


The PriorityQueue in Java is based on a heap, which is a type of binary tree data structure. Specifically, it uses a binary heap to maintain the order of elements. Here's a breakdown of how it works:
 */

import java.util.PriorityQueue;

public class Q2connectropes {

    static int minCost(int arr[], int n) {
        //Create a priority queue (min-heap) to store rope length
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //add all elements of the array to the priority queue
        for(int i=0; i<n; i++) {
            pq.add(arr[i]);
        }

        //intialize the total cost to zero
        int totalCost = 0;

        //continue combining ropes until only one rope remains
        while (pq.size() > 1) {
            //extract the two smallest ropes from the priority queue
            int first = pq.poll(); //smallest rope also removed in pq
            int second = pq.poll(); //second smallest rope

            //add the cost of combining these two ropes to the total cost
            totalCost += first + second;

            //add the combined rope length back to the priority queue
            pq.add(first + second);
        }

        //return the total cost
        return totalCost;
    }
    public static void main(String[] args) {
        int len[] = {4, 3, 2, 6};
        int size = len.length;

        System.out.println("Total cost for connecting ropes is " + minCost(len, size));
    }
}
