class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int start=1;
       int end=0;
       int ans=0;

       for(int i=0;i<piles.length;i++){
        end=Math.max(piles[i], end);
       }

       while(start<=end){
        int mid=start+(end-start)/2;
        int hours=0;
        for(int i=0;i<piles.length;i++){
             hours += Math.ceil((double)piles[i] / mid);
        }
        if(hours<=h){
            ans=mid;
            end=mid-1;
        } else{
            start=mid+1;
        }
       } 
       return ans;
    }
}