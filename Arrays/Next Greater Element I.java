class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i=0;i<nums1.length;i++){
            boolean flag=false;
            boolean change=false;
            for(int j=0;j<nums2.length;j++){
             if(nums2[j]==nums1[i]){
                flag=true;
             }
             if(flag && nums1[i]<nums2[j]){
                nums1[i]=nums2[j];
                change=true;
                break;
             }
            }
            if(!change){
                nums1[i]=-1;
            }
        }
        return nums1;
    }
}
