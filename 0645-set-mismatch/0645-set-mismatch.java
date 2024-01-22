class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = -1;
        int missing = -1;
        
        for(int i : nums){
            if(nums[Math.abs(i) - 1] < 0){
                dup=Math.abs(i);
            }
            else{
                nums[Math.abs(i) - 1] *= -1;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                missing=i+1;
            }
        }
        return new int[]{dup,missing};
    }
}