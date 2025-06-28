# 1. Sliding Window
## Intuition
- As we need to find the difference between two number such that the first occuring number should be small and the subsequent number found should be larger.

## Tags:
- Dynamic sliding window

## Approach
- We need to define three variables: left=0, right=0+1 and maxSum
- Then we iterate through the list of elements.
  - If the element at index left is greater than one on the right we will increase the value of left to right
  - Otherwise, we would compute the difference between the numbers at the specified indexes and if its larger than the maxSum, it replaces it.
  - With each iteration we increment the right pointer

## Time complexity : $$O(n)$$
## Space complexity: $$O(1)$$