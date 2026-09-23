class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int start = 0;
        int end = 0;

        for (int i = 0; i < weights.length; i++) {
            start = Math.max(start, weights[i]);
            end += weights[i];
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int daysNeeded = 1;
            int currentWeight = 0;

            for (int i = 0; i < weights.length; i++) {

                if (currentWeight + weights[i] > mid) {
                    daysNeeded++;
                    currentWeight = weights[i];
                } else {
                    currentWeight += weights[i];
                }
            }

            if (daysNeeded <= days) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}