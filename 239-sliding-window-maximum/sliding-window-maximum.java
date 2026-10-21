class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int idx = 0;

        for (int high = 0; high < n; high++) {

            // Remove indices outside the window
            while (!dq.isEmpty() && dq.peekFirst() <= high - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[high]) {
                dq.pollLast();
            }

            dq.offerLast(high);

            // Record maximum once the window has size k
            if (high >= k - 1) {
                ans[idx++] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}