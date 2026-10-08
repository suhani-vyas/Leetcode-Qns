class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int max=0;
        HashSet<Character> hashset= new HashSet<>();
        
        while(right<s.length()){
        if(!hashset.contains(s.charAt(right))){
           hashset.add(s.charAt(right));
           right++;
           
           max=Math.max(max, hashset.size());
        } else{
            hashset.remove(s.charAt(left));
            left++;
        }
        }
        return max;
    }
}