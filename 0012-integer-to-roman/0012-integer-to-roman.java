class Solution {
    public String intToRoman(int num) {
        int[] nosInInt = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<nosInInt.length;i++){
            while(num >= nosInInt[i]){
                sb.append(roman[i]);
                num -= nosInInt[i];
            }
        }
        return sb.toString();
    }
}