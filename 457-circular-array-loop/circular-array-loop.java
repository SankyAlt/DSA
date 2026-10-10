class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int slow = i;
            int fast = i;
            boolean forward = nums[i] > 0;

            while (true) {
                slow = nextIndex(nums, slow, forward);
                if (slow == -1) break;

                fast = nextIndex(nums, fast, forward);
                if (fast == -1) break;

                fast = nextIndex(nums, fast, forward);
                if (fast == -1) break;

                if (slow == fast) {
                    return true;
                }
            }
        }

        return false;
    }

    private int nextIndex(int[] nums, int current, boolean forward) {
        boolean direction = nums[current] > 0;

        // Direction must remain the same
        if (direction != forward) {
            return -1;
        }

        int n = nums.length;
        int next = ((current + nums[current]) % n + n) % n;

        // A one-element cycle is invalid
        if (next == current) {
            return -1;
        }

        return next;
    }
}