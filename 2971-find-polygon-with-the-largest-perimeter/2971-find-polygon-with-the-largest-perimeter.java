class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        long curSum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            curSum+=nums[i];
            long rem =sum - curSum;
            if(rem>nums[i]){
                return rem+nums[i];
            }
        }
        return -1;
    }
}