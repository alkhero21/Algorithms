class Solution {
    public int findFinalValue(int[] nums, int original) {
        int result=original;
        for(int i=0;i<nums.length;){
            if(result==nums[i]){
                result*=2;
                i=0;
            }else{
                i++;
            }
        }
        return result;
    }
}
