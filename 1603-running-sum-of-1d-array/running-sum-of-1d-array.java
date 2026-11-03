class Solution {
    public int[] runningSum(int[] nums) {
        int sum =0;
        for(int i=0;i<nums.length;i++){
            int y = nums[i];
            nums[i] = sum +nums[i];
            sum = sum + y;
        }return nums;
    }
    
}