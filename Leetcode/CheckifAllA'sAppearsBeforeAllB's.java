class Solution {
    public boolean checkString(String s) {
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]=='b'&&ch[i+1]=='a')
            return false;
        } 
    return true;
    }
}
