// Length of Last Word - Leetcode

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length() - 1;
        
        while(s.charAt(i) == ' '){
            i--;
        }
        
        while(s.charAt(i) != ' '){
            count++;
            i--;
            if(i < 0)
                return count;
        }
        
        return count;
    }
}
