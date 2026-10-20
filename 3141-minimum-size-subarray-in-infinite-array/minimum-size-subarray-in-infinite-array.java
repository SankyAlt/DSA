class Solution {
    public int minSizeSubarray(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int minlen = Integer.MAX_VALUE;
        long sum = 0;
        long numsum = 0;
        for (int i = 0; i < n; i++) {
            numsum += nums[i];
        }
        long k = target / numsum;//this tells whether how many complete copies of nums required (they do connect)
        long rem = target % numsum;//this tells how much remaining sum is needed to find without complete copies
        if (rem == 0) {
            return (int) (k * n);//this returns k*n as int
        }
        for (int high = 0; high < 2 * n; high++) {
            sum += nums[high % n];

            while (sum >= rem) {
                if (sum == rem) {
                    int len = high - low + 1;
                    minlen = Math.min(minlen, len);
                }
                sum -= nums[low % n];
                low++;
            }

        }
        if (minlen == Integer.MAX_VALUE) {
            return -1;
        }
        return (int) (k * n + minlen);
    }
}