class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int minending = nums[0];
        int maxending = nums[0];
        int ansmax = nums[0];
        int ansmin = nums[0];

        for (int i=1;i<n;i++){
            int v1 = nums[i];
            int v2 = minending + nums[i];
            int v3 = maxending + nums[i];
            maxending = Math.max(v1,v3);
            minending = Math.min(v1,v2);
            ansmax = Math.max(ansmax,maxending);
            ansmin = Math.min(ansmin,minending);
        }
        return Math.max(Math.abs(ansmax),Math.abs(ansmin));
    }
}