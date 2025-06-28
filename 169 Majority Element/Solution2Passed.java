class Solution2Passed {
    public int majorityElement(int[] nums) {
        //Approch 2
        int counter = 0;
        Integer candidate = null;
        for(int i:nums) {
            if(counter==0) {
                candidate = i;
            }
            counter += candidate==i ? 1 : -1;
        }

        return candidate;
    }
}