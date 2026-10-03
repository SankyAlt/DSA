class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for (int i = n-1; i >0; i--) { ////////////in this we have to fix the largest side first that means array is orted and largest is n-1 and move left right accordingly
            int left = 0;
            int right = i-1;
            
            while (left < right) {
                boolean condition = nums[right] + nums[left] > nums[i];
                if (!condition) {
                    left++;
                } else {
                    count += right - left;// next all left satisfy the condition
                    right--;
                }
            }
        }
        return count;
    }
}