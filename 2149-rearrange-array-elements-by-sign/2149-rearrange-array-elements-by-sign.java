class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        for (int num : nums) {
            if (num > 0) {
                l1.add(num);
            } else {
                l2.add(num);
            }
        }
        
        int idx1 = 0;
        int idx2 = 0;
        
        while (idx2 < nums.length / 2) {
            ans.add(l1.get(idx1));
            idx1++;
            ans.add(l2.get(idx2));
            idx2++;
        }
        
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}