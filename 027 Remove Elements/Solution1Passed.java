class Solution {

    public int removeElement(int[] nums, int val) {
        int trav,swap;
        swap = trav = nums.length - 1;

        while(trav>=0) {
            if(nums[trav]==val){
                if(trav==swap) {
                    nums[trav] = 0;
                }else {
                    nums[trav] = nums[swap];
                    nums[swap] = 0;
                }
                swap--;
            }
            trav--;
        }
        return swap + 1;
    }
}