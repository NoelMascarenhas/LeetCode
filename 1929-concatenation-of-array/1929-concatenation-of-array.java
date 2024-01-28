class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length-1;
        int l = 2*nums.length-1;
        int[] ans = new int[l+1];
        
        while(n>=0){
            ans[n]=nums[n];
            ans[l]=nums[n];
            n--;
            l--;
        }
        return ans;
    }
}