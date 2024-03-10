class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for(Integer i : nums1){
            s1.add(i);
        }
        for(Integer i : nums2){
            if(s1.contains(i)){
                s2.add(i);
            }
        }
        int idx=0;
        int[] res = new int[s2.size()];
        for(Integer i : s2){
            res[idx]=i;
            idx++;
        }
        return res;
    }
}