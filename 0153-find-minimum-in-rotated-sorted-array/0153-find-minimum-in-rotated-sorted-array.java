class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                // min is on the right
                start = mid + 1;
            } else {
                // min is at mid or in left half
                end = mid;
            }
        }

       
        return nums[start]; // or also return[end]
        //as both lie on the min index when our loop ends
    }
}