class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int c=0;
        while(left!=right){
            left/=2;
            right/=2;
            c++;
        }
        return left<<c;
    }
}