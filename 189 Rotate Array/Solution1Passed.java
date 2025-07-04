public class Solution1Passed {

    public void swapper(int[] nums, int start, int end) {
        int mid = (int)(start+end)/2;
        while(start<end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
        
    }

    public void rotate(int[] nums, int k) {
        swapper(nums, 0, nums.length-(k%nums.length)-1);
        swapper(nums, nums.length-(k%nums.length), nums.length-1);
        swapper(nums, 0, nums.length-1);
    }
}