
class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int maxlen = 0;
        int maxFreq = 0;
        int[] freq = new int[26];

        for (int end = 0; end < s.length(); end++) {
            freq[s.charAt(end) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(end) - 'A']);

            while ((end - start + 1) - maxFreq > k) {
                freq[s.charAt(start) - 'A']--;
                start++;
            }

            maxlen = Math.max(maxlen, end - start + 1);
        }

        return maxlen;
    }
}
