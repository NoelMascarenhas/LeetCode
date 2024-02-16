class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num : arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        List<Integer> l1 = new ArrayList<>();
        int cnt = 0;
        for(int i : mp.values()){
            l1.add(i);
        }
        Collections.sort(l1);
        for(int i=0;i<l1.size();i++){
            if(k>l1.get(i)){
                k-=l1.get(i);
                l1.set(i,0);
            }
            else{
                 l1.set(i,l1.get(i)-k);
                k=0;
            }
            if(l1.get(i) != 0) 
               cnt++;
        }
        return cnt;
    }
}