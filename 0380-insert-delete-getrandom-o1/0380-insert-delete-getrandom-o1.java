class RandomizedSet {
    ArrayList<Integer> list = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<>();
    Random rand = new Random();
    
    public RandomizedSet() {
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        else{
            map.put(val,list.size());
            list.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int len=map.get(val);
        if(len<list.size()-1){
            int temp = list.get(list.size()-1);
            list.set(len,temp);
            map.put(temp,len);
        }
        map.remove(val);
        list.remove(list.size()-1);
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */