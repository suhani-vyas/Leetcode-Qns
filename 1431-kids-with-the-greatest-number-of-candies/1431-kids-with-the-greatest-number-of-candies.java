class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> ans = new ArrayList<>();

        // Find maximum first
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }

//checking each kids candies
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        return ans;
    }
}