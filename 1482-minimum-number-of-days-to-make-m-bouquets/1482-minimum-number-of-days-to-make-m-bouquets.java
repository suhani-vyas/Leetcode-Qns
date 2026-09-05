class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int start=0;
        int end=0;
        int ans=-1;;
        for(int i=0;i<bloomDay.length;i++){
            end=Math.max(end,bloomDay[i]);
            start=Math.min(start, bloomDay[i]);
        }
        
        while(start<=end){
        int mid=start+(end-start)/2;
        int flowers=0;
        int bouquets=0;
        for(int i=0;i<bloomDay.length;i++){
            //if this flower has bloomed by mid day
            if(bloomDay[i]<=mid){
            flowers++;
            
            if(flowers==k){
                bouquets++;
                flowers=0;
            }
        } else{
            flowers=0;
        }
        //if enough bouquets
        } if(bouquets>=m){
            ans=mid;
            end=mid-1;
        } else{
            start=mid+1;
        }
        }
        return ans;
    }
}