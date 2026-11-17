class Solution {
    public String reverseWords(String s) {
        String word[]= s.split(" ");
        String result= "";

        for(int i=0;i<word.length;i++){
            StringBuilder sb= new StringBuilder(word[i]);
            sb.reverse();

            result= result+ sb.toString();

            if(i!=word.length-1){
                result=result+ " ";
            }
        }
        return result;
    }
}