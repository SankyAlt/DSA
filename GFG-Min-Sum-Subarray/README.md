Minimum Sum Subarray

Difficulty: Medium
Accuracy: 72.37%
Submissions: 42K+
Points: 4
Average Time: 15m

Problem Statement

Given an array arr[], find the subarray containing at least one number that has the minimum sum, and return its sum.

Examples
Example 1

Input:

arr[] = [3, -4, 2, -3, -1, 7, -5]

Output:

-6

Explanation:

The minimum-sum subarray is:

[-4, 2, -3, -1]

Its sum is:

-4 + 2 - 3 - 1 = -6
Example 2

Input:

arr[] = [2, 6, 8, 1, 4]

Output:

1

Explanation:

The minimum-sum subarray is:

[1]

Its sum is:

1
Constraints
1 ≤ arr.size() ≤ 10⁶
-10⁷ ≤ arr[i] ≤ 10⁷
Approach

This problem can be solved using Kadane's Algorithm, but instead of finding the maximum subarray sum, we find the minimum subarray sum.

For each element, we decide whether to:

Start a new subarray from the current element, or
Extend the previous subarray.
bestending = Math.min(arr[i], bestending + arr[i]);

Then keep track of the minimum sum found so far:

ans = Math.min(ans, bestending);
Complexity
Time: O(n)
Space: O(1)
