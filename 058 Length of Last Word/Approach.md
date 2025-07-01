# Approach 1
- We need to split the given sentence into an array of words, from which we can pick the last word and calculate its size.
- Approach:
  - Trim the trailing whitespaces.
  - Split the word with condition of whitespace ` `
  - Then select the last word from the array of words and then return its length.