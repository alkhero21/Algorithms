// LeetCode - 7
class Solution {
    public int reverse(int x) {
        long res = 0;
        while(x != 0){
            int r = x % 10;
            res = res * 10 + r;
            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
                return 0;
            x = x / 10;
        }
        
        return (int)res;
    }
}
