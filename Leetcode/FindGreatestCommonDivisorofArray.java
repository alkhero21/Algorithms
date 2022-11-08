//Find Greatest Common Divisor of Array 

class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
            if(min > nums[i]){
                min = nums[i];
            }
        }
        
    while (min != max) {
            if (min > max) {
                min -= max;
            } else {
                max -= min;
            }
        }
        return min;
        
    }
}
