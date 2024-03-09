class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int a=0, b=0;
        int l1=nums1.length, l2=nums2.length;
        
        while(a<l1 && b<l2){
            if(nums1[a]==nums2[b]){
                return nums1[a];
            }
            else if(nums1[a]>nums2[b]){
                b++;
            }
            else{
                a++;
            } 
        }
        return -1;
    }
}