## Apporach 1
- We will being from the end of the string, and check the values if its equal to certain. Then add it to the result.
- Incase it lies in the edge case. i.e.
    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

Then we are going to specifically check if the preceding element criteria is met. If its met then we shall modify the value that needs to be added to result.

### Time complexity: O(n)
### Space complexity: O(1)

## Approach 2
- We will begin from the index 0 of the string and do the following:
  - Store the value of roman characters in a hashmap
  - if the index length + 1< than the total length of string and if the val of index is less than than the next index
    - Then substract the value from res
  - Otherwise
    - Add the value of the character

### Time complexity: O(n)
### Space complexity: O(1)
