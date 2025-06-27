public class Solution1Passed {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==0) {
            return 0;
        }

        int swapper, traverser, lastElement;
        swapper = 1;
        traverser = 1;
        lastElement = nums[0];
        
        for(int i=1;i<nums.length;i++) {
            if(lastElement!=nums[i]) {
                nums[swapper] = nums[i];
                lastElement = nums[swapper];
                swapper++;
            }
            traverser++;
        }
        return swapper;
    }
}