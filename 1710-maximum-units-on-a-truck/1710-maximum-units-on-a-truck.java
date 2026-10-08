class Solution {
     
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //FRACTIONAL KNAPSACK

       // [1,3] means 1 box which consists of 3 smaller boxes
       //1 is type of box, 3 is usme kitne aur box aayenge

       // we need to maximise units so we'll sort on units basis in descending
     Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
    int n= boxTypes.length;
    int size=truckSize;
    int unit=0;

    for(int i=0;i<n;i++){ 
        if(boxTypes[i][0] <= size){
            size= size-boxTypes[i][0]; //reduce size if its greater than acceptable size
            unit = unit+boxTypes[i][0]*boxTypes[i][1];
        } else{
            unit+=boxTypes[i][1]*size; //jitna size bacha hai usko add kardenge 
             break;
        }
    }
    return unit;
    }
}