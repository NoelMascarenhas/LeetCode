class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();
        for(Integer i : nums1){
            set1.add(i);
        }
        for(Integer i : nums2){
            if(set1.contains(i)){
                common.add(i);
            }
        }
        int[] ans = new int[common.size()];
        int index=0;
        for(Integer i : common){
            ans[index]=i;
            index++;
        }
        return ans;
    }
}