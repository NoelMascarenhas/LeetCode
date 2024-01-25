class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int a_pointer=0;
        int b_pointer=height.length-1;
        
        while(a_pointer < b_pointer){
            if(height[a_pointer] < height[b_pointer]){
                maxArea = Math.max(maxArea, height[a_pointer] * (b_pointer-a_pointer));
                a_pointer++;
            }
            else{
                maxArea = Math.max(maxArea, height[b_pointer] * (b_pointer-a_pointer));
                b_pointer--;
            }
        }
        return maxArea;
    }
}