class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int maxending = nums[0];
        int minending = nums[0];
        int maxsum = nums[0];
        int minsum = nums[0];
        int subarraysum = nums[0];
        for (int i=1;i<n;i++){
            subarraysum += nums[i];
            int v1 = nums[i];
            int v2 = maxending + nums[i];
            int v3 = minending + nums[i];
            maxending = Math.max(v1,v2);
            minending = Math.min(v1,v3);
            maxsum = Math.max(maxsum,maxending);
            minsum = Math.min(minsum,minending);
            
        }
        if (maxsum < 0){   //if subarray has all negative elements
                return maxsum;
            }
        
        int maxsum2 = subarraysum - minsum;
        int ans = Math.max(maxsum,maxsum2);
        return ans;
    }
}