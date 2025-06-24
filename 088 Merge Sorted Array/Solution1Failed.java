class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 =0, p2 = 0;
        if(n==0){
            return;
        }
        if(m==0){
            for(int i = 0;i<n;i++){
                nums1[i] = nums2[i];
            }
            
            return;
        }
        for(int i=0;i<m+n;i++) {
            if(nums1[p1]>nums2[p2]){
                int tmp = nums1[p1];
                nums1[p1] = nums2[p2];
                nums2[p2] = tmp;
            }else if(nums1[p1]==0 && p2<n){
                int tmp = nums1[p1];
                nums1[p1] = nums2[p2];
                nums2[p2] = tmp;
                p2++;
            }
            p1++;
        }
    }
}