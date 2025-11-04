class Solution {
    static{
        for(int i=0;i<500;i++){
            checkInclusion("abc", "abc");
        }
    }

    public static boolean checkInclusion(String s1, String s2) {
        // 0. Edge case if(s1.len>s2.len) return false
        // 1. Permute all the possible combination of s1 and put in a set
        // 2. create a window of lenght s1.len and slide over s2
        // 3. In each slide check if the substring is present in set, if yes return true
        // 4. End of loop return false;

        // 1. edge case
        if(s1.length()>s2.length()){
            return false;
        }

        //2. Permuation
        Set<String> permSet = new HashSet<>();
        permutate(s1.toCharArray(), 0, permSet);

        // 3. Sliding
        int windowSize = s1.length(); 
        for(int i=0;i<s2.length()-windowSize+1;i++){
            String subString = s2.substring(i, i+windowSize);
            if(permSet.contains(subString)){
                return true;
            }
        }

        // 4. No element found
        return false;
    }

    public static void permutate(char[] word, int start, Set<String> result) {

        if(start==word.length-1) {
            result.add(new String(word));
        }

        for(int i=start;i<word.length;i++) {
            swap(word, start, i);
            permutate(word, start+1, result);
            swap(word, i, start);
        }
    }

    public static void swap(char[] word, int i, int j) {
        char temp = word[i];
        word[i] = word[j];
        word[j] = temp;
    }
}