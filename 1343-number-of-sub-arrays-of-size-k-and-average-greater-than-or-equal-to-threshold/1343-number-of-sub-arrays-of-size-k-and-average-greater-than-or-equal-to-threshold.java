class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0;
        int ans=0;
        int sum=0;

        for(int i = 0; i < k; i++){
            sum=sum+arr[i];
        }

        if(sum>=k*threshold){
            ans++;
        }
        for(int right=k;right<arr.length;right++){
            sum=sum-arr[left];
            left++;
            sum=sum+arr[right];
            if(sum>=k*threshold){
                ans++;
            }
        }
        return ans;
    }
}