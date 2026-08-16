class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix==null || matrix.length==0){
            return new int[0][0];
        }
        //orignal array
       int totalrows= matrix.length;
       int totalcols= matrix[0].length; 
       int ans[][]= new int [totalcols][totalrows];
       
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            ans[j][i]=matrix[i][j];
        }
       }
       return ans;
    }
}