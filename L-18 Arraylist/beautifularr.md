### Explanation of the "Beautiful Array" Condition:

The variable `k` refers to an index between two other indices `i` and `j` in the array. The condition `2 * nums[k] == nums[i] + nums[j]` means that there should **not** exist any index `k` such that:

- `i < k < j` (i.e., `k` is strictly between `i` and `j`),
- and `2 * nums[k] == nums[i] + nums[j]`.

In simpler terms, **`k` is an index** that lies strictly between `i` and `j` (it is not equal to `i` or `j`), and the value at index `k` (`nums[k]`) must not satisfy the equation `2 * nums[k] == nums[i] + nums[j]`.

### Example:

**Array**: `[2, 1, 4, 3]`  
**Condition**: There should be no index `k` such that `i < k < j` and `2 * nums[k] == nums[i] + nums[j]`.

We need to check whether this condition holds for any pair of indices `i` and `j` in the array.

#### Step-by-Step Example:

1. **Consider indices `i = 0` and `j = 3`**:
   - `nums[i] = 2` and `nums[j] = 3`.
   - We need to check if there is any `k` such that `i < k < j` and `2 * nums[k] == nums[i] + nums[j]`.

   For `i = 0` and `j = 3`, we check the middle elements between these indices (`k = 1` and `k = 2`):

   - For `k = 1`, `nums[k] = 1`. Check if `2 * nums[k] == nums[i] + nums[j]`:
     - `2 * 1 = 2` and `nums[i] + nums[j] = 2 + 3 = 5`. This is **not** true, so no violation.
     
   - For `k = 2`, `nums[k] = 4`. Check if `2 * nums[k] == nums[i] + nums[j]`:
     - `2 * 4 = 8` and `nums[i] + nums[j] = 2 + 3 = 5`. This is also **not** true, so no violation.

   Hence, for `i = 0` and `j = 3`, there is no `k` such that the condition `2 * nums[k] == nums[i] + nums[j]` is satisfied. The array is still beautiful for this pair of indices.

2. **Consider indices `i = 1` and `j = 2`**:
   - `nums[i] = 1` and `nums[j] = 4`.
   - We need to check if there is any `k` such that `i < k < j` and `2 * nums[k] == nums[i] + nums[j]`.

   For `i = 1` and `j = 2`, there are no elements between these indices, so no `k` exists. The condition is trivially satisfied.

### Why the Array `[2, 1, 4, 3]` is Beautiful:

In this case, for any pair of indices `i` and `j`, there is no index `k` between them where the condition `2 * nums[k] == nums[i] + nums[j]` holds. Therefore, the array `[2, 1, 4, 3]` satisfies the "beautiful" array condition.

### Arithmetic Operations on a Beautiful Array:

The statement that a "beautiful" array remains beautiful even after multiplying, adding, or subtracting any number can be understood as follows:

The **"beautiful" array** must maintain its special property even after arithmetic operations like multiplication, addition, or subtraction on the elements. This implies that the **arrangement of the numbers in the array** is such that it doesn't violate the condition even after these operations.

### Example Walkthrough:

#### Sample Input 1:
**Input**: `n = 4`  
**Output**: `[2, 1, 4, 3]`

1. **Original Beautiful Array**:
   The array `[2, 1, 4, 3]` is a "beautiful" array because it is a permutation of the integers from 1 to 4, and it satisfies the condition that there is no middle number `k` between any two indices `i` and `j` such that `2 * nums[k] == nums[i] + nums[j]`.

2. **Multiplying by a Number**:
   Let’s say we multiply every element of the array by 2. The new array would be:

   - `2 * 2 = 4`
   - `2 * 1 = 2`
   - `2 * 4 = 8`
   - `2 * 3 = 6`

   The resulting array is `[4, 2, 8, 6]`.

   Now, let’s check if it is still beautiful. The permutation is still a rearranged set of the integers `[1, 2, 3, 4]` (though scaled). Moreover, the **arrangement** of even and odd numbers ensures that no middle element satisfies the condition `2 * nums[k] == nums[i] + nums[j]` for any `i` and `j`. So, even after multiplication, the array remains beautiful.

3. **Adding/Subtracting a Number**:
   Let’s add 1 to every element in the original array `[2, 1, 4, 3]`:

   - `2 + 1 = 3`
   - `1 + 1 = 2`
   - `4 + 1 = 5`
   - `3 + 1 = 4`

   The resulting array is `[3, 2, 5, 4]`. This is still a valid permutation of `[1, 2, 3, 4, 5]`, and the arrangement still ensures that the sum condition is not violated.

   Now, let’s subtract 1 from every element in the original array `[2, 1, 4, 3]`:

   - `2 - 1 = 1`
   - `1 - 1 = 0`
   - `4 - 1 = 3`
   - `3 - 1 = 2`

   The resulting array is `[1, 0, 3, 2]`. This array is not a valid permutation of `[1, 2, 3, 4]` because it contains 0, but if we adjust the operation to ensure the result is a valid permutation, we can see that such arithmetic operations do not disturb the beauty of the array when it remains within the valid permutation range.

---


In this problem, we are given an array `nums` of integers. We define a "beautiful" array as one that satisfies the following condition for all pairs of indices `i` and `j`:

- For every pair `i < j`, there must not exist any index `k` such that `i < k < j` and `2 * nums[k] == nums[i] + nums[j]`.

In simpler terms, for any pair of indices `i` and `j`, there should be no element between them such that its value is the average of `nums[i]` and `nums[j]`.

### Operations

You are also asked to check if the array remains "beautiful" after performing arithmetic operations like:

- Multiplying each element by a constant.
- Adding or subtracting a constant from each element.

The key is that the arrangement of the numbers should not violate the "beautiful" condition after these operations.

## Input

- An integer `n` representing the size of the array.
- A list of integers `nums` of size `n`.

