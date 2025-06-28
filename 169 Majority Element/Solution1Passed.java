import java.util.*;

class Solution1Passed {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Long> counter = new HashMap<>();
        for(int i:nums) {
            if(counter.containsKey(i)){
                counter.put(i, (long)counter.get(i)+1);
            }else {
                counter.put(i, 1L);
            }
        }

        for(int key: counter.keySet()) {
            if(counter.get(key)>(nums.length/2)) {
                return key;
            }
        }
        return 0;
    }
}