class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(n==0) {
            return;
        }

        if(m==0) {
            for(int i=0;i<n;i++) {
                nums1[i] = nums2[i];
            }
        }

        int pointer1 = m-1, pointer2 = n-1, index = m+n-1;
        while(pointer2>=0){
            if(pointer1>-1 && nums2[pointer2]<nums1[pointer1]) {
                nums1[index--] = nums1[pointer1--];
            }else {
                nums1[index--] = nums2[pointer2--];
            }
        }
    }
}