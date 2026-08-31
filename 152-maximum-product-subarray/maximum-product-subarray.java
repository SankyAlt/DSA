class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int minending = nums[0];
        int maxending = nums[0];
        int res = nums[0];
        for (int i=1; i<n; i++){
            int v1 = nums[i];
            int v2 = minending*nums[i];
            int v3 = maxending*nums[i];
            minending = Math.min(v1,(Math.min(v2,v3)));
            maxending = Math.max(v1,(Math.max(v2,v3)));
            res = Math.max(res,Math.max(minending,maxending));
        }return res;
    }
}