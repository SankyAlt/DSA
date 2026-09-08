class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> res = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int start = nums[i];

            // Keep moving while numbers are consecutive
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            // If range contains only one number
            if (start == nums[i]) {
                res.add(String.valueOf(start));
            } 
            else {
                res.add(start + "->" + nums[i]);
            }
        }

        return res;
    }
}