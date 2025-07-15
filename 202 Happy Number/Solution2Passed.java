import java.util.*;

// HashSet
public class Solution2Passed {
    public int getSum(int n) {
        int sum = 0;
        while(n>0) {
            sum += Math.pow(n%10, 2);
            n=(int)n/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> prevN = new HashSet<>();
        while(!prevN.contains(n)) {
            prevN.add(n);
            n = getSum(n);
            if(n==1) {
                return true;
            }
        }
        return false;
    }
}
