class Solution {
    private int sum(int[] nums){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        return sum;
    }
    private int maxDiffSubArray(int[] arr1, int[] arr2){
        int bestending = 0;
        int ans = 0;
        for(int i=0;i<arr1.length;i++){
            int v1 = arr1[i] - arr2[i];
            int v2 = bestending + arr1[i]-arr2[i];
            bestending = Math.max(v1,v2);
            ans = Math.max(bestending,ans);

        }
        return ans;
    }
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int sum1 =sum(nums1);
        int sum2 =sum(nums2);
        return Math.max(maxDiffSubArray(nums1,nums2)+sum2,maxDiffSubArray(nums2,nums1)+sum1);
    }
}