class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1; 
        while(i>=0 && s.charAt(i)==' '){ //loop will run from s.lengh to 0 it skips blank spaces
            i--;
        }
        int count=0;
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
}