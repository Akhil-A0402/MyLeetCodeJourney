1. Brute force
 - Edge case if(s1.len>s2.len) return false
    1. Permute all the possible combination of s1 and put in a set
    2. create a window of lenght s1.len and slide over s2
    3. In each slide check if the substring is present in set, if yes return true
    4. End of loop return false;

Issue : TLE
Test Case: 
"trinitrophenylmethylnitramine"
"dinitrophenylhydrazinetrinitrophenylmethylnitramine"
Time Complexity: 

2. Sorting apporach:
    -  Edge case if(s1.len>s2.len) return false
    1. Take the s1 string and sort it.
    2. Now define the windowSize
    3. In forloop, take the substring, sort it, and compare it to the sorted s1. If match return true.
    4. End of loop, return false