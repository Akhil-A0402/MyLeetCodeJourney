1. Two pointer approach:
- We want the elements which aren't equal to k value to be in the first part of the list and then return such total elements.
- If we begin from end:
  - Initialize two variables which points to maximum index size, one for traversing and other the last point -1 where we found k value element.
  - We iterate until we reach the beginning of the list
    - In this iteration, we will check the elements value. Reduce the traverser value in each iteration. 
      - If its equal to the value k
        - Then check if traversing and swapping are pointing are same. Means the k values are present at end(edge cases). Mark them and reduce swapper variable 
        - If traverser and swapper variable aren't same then replace the element present at traverser index with swapper. Then reduce the swapper.
  - return the value of swapper at end.

Edge cases handled:
- If the swapper and traverser were same, which means the bunch k values are at end of the list.