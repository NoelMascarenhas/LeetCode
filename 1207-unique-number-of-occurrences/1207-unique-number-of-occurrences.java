    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i : arr){
                map.put(i,map.getOrDefault(i,0)+1);
            }
            int maxCount = 0;
            for (int count : map.values()) {
                maxCount = Math.max(maxCount, count);
            }

            // Check for unique occurrences
            int[] occurrences = new int[maxCount + 1];
            for (int count : map.values()) {
                if (occurrences[count] == 1) {
                    return false; // Duplicate occurrence found
                }
                occurrences[count] = 1;
            }

            return true;
        }
    }