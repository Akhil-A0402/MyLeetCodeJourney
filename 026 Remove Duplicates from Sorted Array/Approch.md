# Intuition
Tags: two_pointer
<!-- Describe your first thoughts on how to solve this problem. -->
Two pointer can be used.
# Approach
<!-- Describe your approach to solving the problem. -->
We need to use a variable to track the last element that was updated, and other two pointers for traversing and the last element that was different.

In this approach, we will be checking if the nums contain any element, other wise we will return 0.

Then we define the variables and iterate through then list.
- With each iteration, we compare the last element and the current element to see if there is any variation in there value.
    - If the valuse are different we are going to use the last element index pointer to swap new element to its position and also update the last element variable value.
- Finally we are going to return the total number of distinct elements in the list.   
# Complexity
- Time complexity: $$O(n)$$
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: $$O(1)$$
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==0) {
            return 0;
        }

        int swapper, traverser, lastElement;
        swapper = 1;
        traverser = 1;
        lastElement = nums[0];
        
        for(int i=1;i<nums.length;i++) {
            if(lastElement!=nums[i]) {
                nums[swapper] = nums[i];
                lastElement = nums[swapper];
                swapper++;
            }
            traverser++;
        }
        return swapper;
    }
}
```