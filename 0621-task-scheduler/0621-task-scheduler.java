class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] char_counts = new int[26];
        for(char c : tasks){
            char_counts[c-'A']++;
        }
        Arrays.sort(char_counts);
        int maxVal=char_counts[25]-1;
        int idleSlots=maxVal*n;
        for(int i=24;i>=0;i--){
            idleSlots-=Math.min(char_counts[i],maxVal);
        }
        return idleSlots>0 ? idleSlots+tasks.length : tasks.length;
    }
}