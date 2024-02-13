class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            StringBuilder sb = new StringBuilder(word);
            StringBuilder rev = sb.reverse();
            if(word.equals(rev.toString())){
                return word;
            }
        }
        return "";
    }
}