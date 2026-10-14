
class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int maxfreq = 0;
        int maxlen = 0;
        int[] freq = new int[26];
        for (int end = 0; end < s.length(); end++) {
            freq[s.charAt(end) - 'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(end) - 'A']);
            while ((end - start + 1) - maxfreq > k) {
                freq[s.charAt(start) - 'A']--;
                start++;
            }
            maxlen = Math.max(maxlen, end - start + 1);
        }
        return maxlen;
    }
}
