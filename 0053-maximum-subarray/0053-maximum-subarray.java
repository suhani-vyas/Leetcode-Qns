class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            //create sum
            //update max if sum>max
            //check if sum<0, if yes then reset to 0
            sum=sum+nums[i];
            max=Math.max(max , sum);
             if(sum<0){
                sum=0;
             }
        }
        return max;
    }
}