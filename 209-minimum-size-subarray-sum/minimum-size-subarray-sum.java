class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int high = 0;
        int low = 0;
        int n = nums.length;
        int minarr = Integer.MAX_VALUE;
        int sum = 0;

        while (high < n){
            sum += nums[high];
            while (sum >= target){
                int len = high - low + 1;
                minarr = Math.min(minarr, len);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        if (minarr == Integer.MAX_VALUE){
            return 0;
        }
        return minarr;

    }
}