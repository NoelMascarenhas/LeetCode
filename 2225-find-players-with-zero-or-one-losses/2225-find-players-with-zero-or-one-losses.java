class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> winners = new ArrayList<>();
        List<Integer> losers = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int[] match : matches){
            map.put(match[0], map.getOrDefault(match[0],0)+0);
            map.put(match[1], map.getOrDefault(match[1],0)+1); 
        }
        for(int i: map.keySet()){
            if(map.get(i) == 0){
                winners.add(i);
            }
            else if(map.get(i)==1){
                losers.add(i);
            }
        }
        Collections.sort(winners);
        Collections.sort(losers);
        return Arrays.asList(winners,losers);
    }
}