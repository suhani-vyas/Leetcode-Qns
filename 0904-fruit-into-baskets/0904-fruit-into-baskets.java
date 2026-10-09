class Solution {
    public int totalFruit(int[] fruits) {
        int start=0;
        int end=0;
        int maxlen=0;

        HashMap<Integer, Integer> map= new HashMap<>();
        while(end<fruits.length){
            map.put(fruits[end], map.getOrDefault(fruits[end],0)+1);
            while(map.size()>2){
                map.put(fruits[start],map.get(fruits[start])-1);
                       //fruit we want to remove, its frequency-1 kardo
            if (map.get(fruits[start]) == 0) {
                    map.remove(fruits[start]);
                }

                // Move the left pointer forward
                start++;
        }
             maxlen=Math.max(maxlen, end-start+1);
             end++;
        }
        return maxlen;
        }
       
    }
