class Solution {
    public int lengthOfLIS(int[] nums) {
       // use binary search or DP(however complexity will be more)
        int n=nums.length;
        int dp[]= new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        int ans=1; //initialise ans as 1 as all can form subsequence w themself of length 1

         for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) { //agar right element bada hai
                    if (dp[j] + 1 > dp[i]) {  //increment the value of dp[i] if its larger than exisiting value
                        dp[i] = dp[j] + 1; 
                    }
                }
            }
            if (dp[i] > ans) { //iterate dp[i] and check if any value is biger than ans
                ans = dp[i]; //if yes, make that ans and return ans
            } 
        }
        return ans;
    }
}