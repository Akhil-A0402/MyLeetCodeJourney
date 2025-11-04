class Solution {
    public boolean checkInclusion(String s1, String s2) {
    //     2. Sorting apporach:
        // -  Edge case if(s1.len>s2.len) return false
        // 1. Take the s1 string and sort it.
        // 2. Now define the windowSize
        // 3. In forloop, take the substring, sort it, and compare it to the sorted s1. If match return true.
        // 4. End of loop, return false

        if(s1.length()>s2.length()) {
            return false;
        }

        s1 = sorter(s1);

        int windowSize = s1.length();
        for(int i=0;i<s2.length()-windowSize+1;i++) {
            String subString = s2.substring(i, i+windowSize);
            subString = sorter(subString);
            if(s1.equals(subString)) {
                return true;
            }
        }
        return false;
    }

    static String sorter(String word) {
        char[] wordChar = word.toCharArray();
        Arrays.sort(wordChar);
        return new String(wordChar);
    }
}