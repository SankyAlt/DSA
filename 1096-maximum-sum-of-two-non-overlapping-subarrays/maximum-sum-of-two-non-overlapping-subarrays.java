class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int firstOrder = calculate(nums, firstLen, secondLen);
        int secondOrder = calculate(nums, secondLen, firstLen);

        return Math.max(firstOrder, secondOrder);
    }

    // L-length window comes before M-length window
    private int calculate(int[] nums, int L, int M) {
        int n = nums.length;
        int lsum = 0;
        int msum = 0;

        // Initial L-length window
        for (int i = 0; i < L; i++) {
            lsum += nums[i];
        }

        // Initial M-length window immediately after L
        for (int i = L; i < L + M; i++) {
            msum += nums[i];
        }

        int maxL = lsum;
        int answer = lsum + msum;

        for (int i = L + M; i < n; i++) {
            // Update the best L-window that ends before M-window
            lsum += nums[i - M] - nums[i - M - L];
            maxL = Math.max(maxL, lsum);

            // Slide the M-window
            msum += nums[i] - nums[i - M];

            answer = Math.max(answer, maxL + msum);
        }

        return answer;
    }
}