class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs =new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }
        int[] arr = new int[hs.size()];
        int index=0;
        for(int i : hs){
            arr[index]=i;
            index++;
        }
        Arrays.sort(arr);
        if(arr.length<3){
            return arr[arr.length-1];
        }
        return arr[arr.length-3];
    }
}