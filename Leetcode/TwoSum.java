// LeetCode - 1: TwoSum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] s = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(target == nums[i] + nums[j]){
                    s[0] = i;
                    s[1] = j;
                }
            }
        }
        return s;
    }
}
