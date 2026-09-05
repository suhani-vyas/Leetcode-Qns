class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int ans=0;

        int end = 0;

    for(int i = 0; i < nums.length; i++){
    end = Math.max(end, nums[i]);
}
       
        while(start<=end){
            int mid=start+(end-start)/2;
            int divisor=0;
            for(int i=0;i<nums.length;i++){
            divisor += Math.ceil((double) nums[i]/mid);
        }
        if(divisor<=threshold){
        ans=mid;
        end=mid-1;
        } else{
            start=mid+1;
        }
        }
        return ans;
    }
}