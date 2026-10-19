class Solution {
    public int minSizeSubarray(int[] nums, int target) {
        int n = nums.length;
        long sum = 0;

        for (int num : nums) {
            sum += num;
        }

        long k = target / sum;
        long rem = target % sum;

        if (rem == 0) {
            return (int) (k * n);
        }

        int low = 0;
        long currsum = 0;
        int minlen = Integer.MAX_VALUE;

        for (int high = 0; high < 2 * n; high++) {
            currsum += nums[high % n];

            while (currsum > rem) {
                currsum -= nums[low % n];
                low++;
            }

            if (currsum == rem) {
                minlen = Math.min(minlen, high - low + 1);
            }
        }

        if (minlen == Integer.MAX_VALUE) {
            return -1;
        }

        return (int) (k * n + minlen);
    }
}