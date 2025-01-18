/* JOB SEQUENCING PROBLEM
we have an array of jobs where every job had a deadline and associated profit. if the job is finished before the deadline. it is also given that every job takes single unit of time, so the minimum possible deadline for any job is 1. maximum the total profit if only one job can be scheduled at a time


 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q3jobsequence {

    //Define a job class with attributes : job_id, deadline, and profit
    static class Job {
        char job_id; 
        int deadline;
        int profit;

        Job(char job_id, int deadline, int profit) {
            this.deadline = deadline;
            this.job_id = job_id;
            this.profit = profit;
        }
        
    }

    //Method to print the job sequence that gives maximum profit
    static void printJobScheduling(ArrayList<Job> arr) {
        int n = arr.size(); //get the number of jobs

        //sort the jobs based on the deadline (ascending order) using custom comparitor + lambda expression : -

        /* Collections.sort(arr, ...): This is a built-in method in Java that sorts a list, in this case, arr (which is an ArrayList<Job>), using a custom comparator.
        Lambda expression (a, b) -> { return a.deadline - b.deadline; }: This is a lambda expression used to define how two Job objects should be compared for sorting.
        a and b: These represent two Job objects being compared during sorting.
        a.deadline - b.deadline: This is the comparison logic for sorting.
        If a.deadline < b.deadline, it returns a negative value, meaning a should come before b in the sorted list.
        If a.deadline > b.deadline, it returns a positive value, meaning b should come before a.
        If a.deadline == b.deadline, it returns 0, meaning the two jobs are considered equal in terms of deadline, and their relative order remains unchanged. */

        Collections.sort(arr, (a, b) -> { return a.deadline - b.deadline;} );  //ascen

        //create a result list to store the jobs in the selected sequence
        ArrayList<Job> result = new ArrayList<>();

        //create a max-heap to select jobs with highest profits
        PriorityQueue<Job> maxHeap = new PriorityQueue<>( (a, b) -> { return b.profit - a.profit;} ); //descen

        //traverse the jobs in reverse order (from the last job to the first)
        for(int i=n-1; i>-1; i--) {
            int slot_available;

            //if its the first job slot_available is th job's deadline
            if(i == 0) {
                slot_available = arr.get(i).deadline;
            }
            else {
                //otherwise calculate the available slots based on the previous job's deadline
                slot_available = arr.get(i).deadline - arr.get(i-1).deadline;
            }
            // Add the current job to the max-heap (priority queue)
            maxHeap.add(arr.get(i));

            // While there are available slots and jobs in the max-heap
            while (slot_available > 0 && maxHeap.size() > 0) {
                // Extract the job with the highest profit from the heap
                Job job = maxHeap.remove();
                slot_available--;  // Decrease available slots
                result.add(job);    // Add the job to the result list
            }
        }
         // Sort the selected jobs based on their deadlines
         Collections.sort(result, (a, b) -> {
            return a.deadline - b.deadline;
        });

        // Print the job IDs in the order of execution
        for (Job job : result) {
            System.out.print(job.job_id + " ");
        }

        // Print a new line after the job sequence
        System.out.println();
    }

    public static void main(String[] args) {
        //create an arrayList to store the jobs
        ArrayList<Job> arr = new ArrayList<>();

        //add jobs with their job_id, deadline, and profit
        arr.add(new Job('a', 2, 100));
        arr.add(new Job('b', 1, 19));
        arr.add(new Job('c', 2, 27));
        arr.add(new Job('d', 1, 25));
        arr.add(new Job('e', 3, 15));

        //Print the maximum profit job sequence 
        System.out.println("Following is maximum " + " profit sequence of jobs");
        printJobScheduling(arr); //function call


    }
}
