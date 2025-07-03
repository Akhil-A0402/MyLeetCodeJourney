public class Solution1Passed {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) {
            return "";
        }
        String prefix = strs[0];
        for(String word: strs) {
            while(word.indexOf(prefix)!=0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}