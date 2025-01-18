
# Job Sequencing Problem

## Problem Explanation

In the **Job Sequencing Problem**, you are given a set of jobs where each job has:

- A **Job ID** (e.g., `a`, `b`, `c`, etc.)
- A **Deadline** (the latest time by which the job must be completed)
- A **Profit** (the profit earned if the job is completed before its deadline)

The objective is to **maximize the total profit** by scheduling the jobs, with the constraint that only **one job can be completed at a time**, and each job takes **1 unit of time**.

### Key Points:

1. **Deadline**: The job must be completed before or at the specified deadline.
2. **Single Unit of Time**: Each job takes 1 unit of time to complete.
3. **One Job at a Time**: Only one job can be executed at a time, so you need to decide which jobs to select to maximize the total profit.
4. **Maximize Profit**: You aim to schedule jobs such that the total profit is maximized, keeping in mind the constraints of deadlines.

### Problem Constraints:

- If a job is completed before or at its deadline, it earns the given profit.
- You cannot complete more than one job at a time.
- The jobs are scheduled in such a way that they finish before their deadlines.

## Input and Output Format:

### Input:

You are given an array of jobs where each job has:

- JobID
- Deadline
- Profit

Example input:
```

JobID Deadline Profit
a 4 20
b 1 10
c 1 40
d 1 30

```

### Output:
The output should be the sequence of job IDs that will yield the maximum profit.

Example output:
```

c, a

```

## Steps to Solve:

1. **Sort the Jobs by Profit**: First, sort the jobs in decreasing order of profit. This ensures that we prioritize jobs with higher profit.

2. **Select Jobs**: Try to schedule jobs in such a way that the job is completed before its deadline. If the job's deadline is already occupied, we try to find an earlier available time slot.

3. **Maximize Profit**: After selecting the jobs, calculate the total profit earned by completing the jobs within their deadlines.

## Example Walkthrough:

### Input:
```

JobID Deadline Profit
a 4 20
b 1 10
c 1 40
d 1 30

```

### Step 1: Sort the Jobs by Profit:
```

JobID Deadline Profit
c 1 40
d 1 30
a 4 20
b 1 10

```

### Step 2: Schedule the Jobs:
- Start with the job with the highest profit, `c` (Profit = 40), and check if it can be scheduled. The deadline for `c` is 1, and we can complete it at time 1.
- Now, the time slot at time 1 is occupied. The next job is `a` (Profit = 20) with a deadline of 4. We can complete it at time 4.
- There are no more jobs that can be completed before their deadlines.

### Output:
The jobs selected are `c` and `a`, which yield the maximum profit.

### Final Answer:
```

c, a

```

## Algorithm to Solve the Job Sequencing Problem:
1. **Sort the jobs by profit** in descending order.
2. Initialize an array to track which time slots are filled.
3. For each job, try to schedule it at the latest possible time before its deadline.
4. If a job can be scheduled, mark that time slot as filled and add the profit to the total profit.
5. Output the job sequence that yields the maximum profit.
```

You can copy this content into a `.md` file to view it as a markdown document.
