
class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        int MOD = 1_000_000_007;
        int n = arr.length;
        long totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        int[] arr2 = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            arr2[i] = arr[i % n];
        }

        long curr = 0;
        long max2 = 0;

        for (int num : arr2) {
            curr = Math.max(0, curr + num);
            max2 = Math.max(max2, curr);
        }

        long ans;

        if (k == 1) {
            ans = 0;
            curr = 0;

            for (int num : arr) {
                curr = Math.max(0, curr + num);
                ans = Math.max(ans, curr);
            }
        } else {
            ans = max2;

            if (totalSum > 0) {
                ans += (long) (k - 2) * totalSum;
            }
        }

        return (int) (ans % MOD);
    }
}
