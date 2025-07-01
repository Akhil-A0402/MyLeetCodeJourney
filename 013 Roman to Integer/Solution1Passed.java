import java.util.*;

class Solution1Passed {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mapping = new HashMap<>();
        mapping.put('I', 1);
        mapping.put('V', 5);
        mapping.put('X', 10);
        mapping.put('L', 50);
        mapping.put('C', 100);
        mapping.put('D', 500);
        mapping.put('M', 1000);
        int lastIndex = s.length()-1;
        int res = 0;
        while(lastIndex>=0) {
            int val =  mapping.get(s.charAt(lastIndex));
            boolean nextIndexExists = lastIndex-1>=0;
            if(s.charAt(lastIndex)=='V' && nextIndexExists && s.charAt(lastIndex-1)=='I'){
                val = 4;
                lastIndex--;
            }
            else if(s.charAt(lastIndex)=='X' && nextIndexExists && s.charAt(lastIndex-1)=='I'){
                val = 9;
                lastIndex--;
            }
            else if(s.charAt(lastIndex)=='L' && nextIndexExists && s.charAt(lastIndex-1)=='X'){
                val = 40;
                lastIndex--;
            }
            else if(s.charAt(lastIndex)=='C' && nextIndexExists && s.charAt(lastIndex-1)=='X'){
                val = 90;
                lastIndex--;
            }
            else if(s.charAt(lastIndex)=='D' && nextIndexExists && s.charAt(lastIndex-1)=='C'){
                val = 400;
                lastIndex--;
            }
            else if(s.charAt(lastIndex)=='M' && nextIndexExists && s.charAt(lastIndex-1)=='C'){
                val = 900;
                lastIndex--;
            }
            lastIndex--;
            res += val;
        }
        return res;
    }
}