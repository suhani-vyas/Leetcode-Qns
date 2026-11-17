
class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u') {
                count++;
            }
        }
        maxCount = count;
        for(int i = k; i < s.length(); i++) {
            char remove = s.charAt(i - k);
            char add = s.charAt(i);
            if(remove == 'a' || remove == 'e' || remove == 'i' ||
               remove == 'o' || remove == 'u') {
                count--;
            }
            if(add == 'a' || add == 'e' || add == 'i' ||
               add == 'o' || add == 'u') {
                count++;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
