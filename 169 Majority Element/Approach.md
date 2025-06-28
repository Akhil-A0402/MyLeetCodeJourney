1. Approach 1:
## Intuition 
- We can use a hashmap to store the distinct elements count.
- Then from this we can select the element which is more than total_array_length/2

## Approach
- Create a hashmap to store the distinct elements and its frequency
- Then iterate through the list and then record the frequency.
- Then check for the elements which is more than the given condition i.e. n/2

Time complexity: $$O(n)$$
Space complexity: $$O(n)$$ worst-case

2. Boyer Moore Voting Algorithm
## Intuition 
- In the given list of elements, one of the element will have maximum count.
- We will be using Boyer Moore Voting Algorithm

## Approach
- Define two variables counter and candidate
- We then iterate through the list of elements.
- If the value of the counter is 0 we assign the candidate element as the current element.
- The counter value will be incremented or decremented on the basis if the current value is same as the candidate.