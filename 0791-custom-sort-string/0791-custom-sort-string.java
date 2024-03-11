class Solution {
    public String customSortString(String order, String s) {
        String s1="",s2="";
        int[] count = new int[26];
        for(char ch : order.toCharArray()){
            count[ch-'a']++;
        }
        for(char ch : s.toCharArray()){
            if(count[ch-'a']==0){
                s2+=ch;
            }
            else{
                count[ch-'a']++;
            }
        }
        for(char ch : order.toCharArray()){
            while(count[ch-'a']>1){
                s1+=ch;
                count[ch-'a']--;
            }
        }
        return s1+s2;
    }
}