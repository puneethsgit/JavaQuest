# APRROACH 2 HERE IT RETURNS MAX_PROFIT AND COUNT

# Job Sequencing Problem - Greedy Algorithm

## Problem Description

The **Job Sequencing Problem** is a scheduling problem where the goal is to schedule jobs within their deadlines to maximize profit. Each job has:

- An `id` (identifier)
- A `deadline` (by when the job must be completed)
- A `profit` (associated with completing the job)

The algorithm aims to select jobs in such a way that the total profit is maximized while adhering to the deadlines.

## Algorithm Used

### Steps Involved:

1. **Job Class:**

   - The `Job` class defines the attributes for each job: `id`, `profit`, and `deadline`.

2. **Sorting the Jobs:**

   - The jobs are sorted in **descending order of profit**. This ensures that we try to schedule the most profitable jobs first, which is the key aspect of the greedy approach.

3. **Determine Maximum Deadline:**

   - The maximum deadline (`maxi`) is determined by iterating over the jobs. This value is used to determine the size of the result array, which will track which time slots are filled.

4. **Job Scheduling:**

   - A result array (`result[]`) is used to keep track of the time slots. Initially, all slots are set to `-1`, indicating that they are free.
   - For each job (starting from the highest profit job), the algorithm attempts to find the latest available time slot (before the job's deadline).
   - If a free slot is found, the job is scheduled in that slot, the count of scheduled jobs is incremented, and the profit is added to the total.

5. **Output:**
   - The function returns an array of size 2:
     - The first element is the count of scheduled jobs.
     - The second element is the total profit from those jobs.

### Time Complexity:

- Sorting the jobs based on profit takes \(O(n \log n)\), where \(n\) is the number of jobs.
- The nested loop iterates through each job and checks for available time slots, which results in a time complexity of \(O(n \cdot m)\), where \(m\) is the maximum deadline.

Thus, the overall time complexity is \(O(n \log n + n \cdot m)\), where \(n\) is the number of jobs and \(m\) is the maximum deadline.

## Java Code

```java
import java.io.*;
import java.lang.*;
import java.util.*;

// Job class represents a job with an id, profit, and deadline
class Job {
   int id, profit, deadline;

   // Constructor to initialize job id, deadline, and profit
   Job(int x, int y, int z) {
      this.id = x;
      this.deadline = y;
      this.profit = z;
   }
}

class solve {
   // Method to schedule jobs in such a way as to maximize profit
   // Returns an array where:
   // - The first element is the count of jobs done
   // - The second element is the total profit
   int[] JobScheduling(Job arr[], int n) {

      // Sort the jobs in descending order of profit (greedy approach)
      Arrays.sort(arr, (a, b) -> (b.profit - a.profit));

      // Find the maximum deadline among all jobs
      int maxi = 0;
      for (int i = 0; i < n; i++) {
         if (arr[i].deadline > maxi) {
            maxi = arr[i].deadline; // Update maxi to the highest deadline
         }
      }

      // Create an array to keep track of scheduled jobs
      // result[i] will store the index of the job scheduled at slot i
      int result[] = new int[maxi + 1];

      // Initialize the result array with -1 (indicating no job is scheduled at that slot)
      for (int i = 1; i <= maxi; i++) {
         result[i] = -1;
      }

      // Initialize variables to track the number of jobs done and the total profit
      int countJobs = 0, jobProfit = 0;

      // Iterate through each job in the sorted array
      for (int i = 0; i < n; i++) {

         // Try to find a free slot for the current job (starting from its deadline)
         for (int j = arr[i].deadline; j > 0; j--) {

            // If a free slot is found (result[j] == -1), schedule the job
            if (result[j] == -1) {
               result[j] = i;  // Mark the slot with the job index
               countJobs++;     // Increment the job count
               jobProfit += arr[i].profit;  // Add the job's profit to total profit
               break;  // Exit the loop as the job is scheduled
            }
         }
      }

      // Create an array to return the result: number of jobs and total profit
      int ans[] = new int[2];
      ans[0] = countJobs;  // Store the number of jobs scheduled
      ans[1] = jobProfit;  // Store the total profit
      return ans;
   }
}

class Main {
   public static void main(String[] args) throws IOException {

      // Initialize an array of jobs
      Job[] arr = new Job[4];
      arr[0] = new Job(1, 4, 20);  // Job 1 with deadline 4 and profit 20
      arr[1] = new Job(2, 1, 10);  // Job 2 with deadline 1 and profit 10
      arr[2] = new Job(3, 2, 40);  // Job 3 with deadline 2 and profit 40
      arr[3] = new Job(4, 2, 30);  // Job 4 with deadline 2 and profit 30

      // Create an object of the solve class
      solve ob = new solve();

      // Call the JobScheduling method and get the result (number of jobs and total profit)
      int[] res = ob.JobScheduling(arr, 4);

      // Print the result: number of jobs and total profit
      System.out.println(res[0] + " " + res[1]);
   }
}

```

## Conclusion

This greedy algorithm effectively schedules jobs to maximize profit while adhering to deadlines. By sorting the jobs based on profit and filling the available time slots starting from the most profitable job, the algorithm ensures optimal job scheduling.
