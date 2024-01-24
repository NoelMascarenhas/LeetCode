class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>(); 
        int result=0;
        
        for(int i=0;i<s.length();i++){
            int count = map.getOrDefault(s.charAt(i),0);
            map.put(s.charAt(i),++count);
            if(count%2==0){
                result+=2;
            }
        }
        for(int len : map.values()){
            if(len%2==1){
                result++;
                break;
            }
        }
        return result;
    }
}