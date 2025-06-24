class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m+n-1;i>=m;i--){
            nums1[i] = nums2[j++];
        }

        int p1 = 0, p2 = m+n-1;
        while(p1<p2) {
            if(nums1[p1]>nums1[p2]){
                int temp = nums1[p1];
                nums1[p1] = nums1[p2];
                nums1[p2] = temp;
            }
            p1++;
        } 
    }
}