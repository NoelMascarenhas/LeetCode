class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maxFreq=0;
        int sumFreq=0;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            int currFreq = freq[nums[i]];
            if(currFreq>maxFreq){
                maxFreq=currFreq;
                sumFreq=currFreq;
            }else if(currFreq==maxFreq){
                sumFreq+=currFreq;
            }
        }
        return sumFreq;
    }
}