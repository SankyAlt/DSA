class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        int low = 0;
        long maxsum = Integer.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < k - 1; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            sum += nums[i];
        }
        
        for (int high = k - 1; high < n; high++) {

            map.put(nums[high], map.getOrDefault(nums[high], 0) + 1);
            sum += nums[high];

            if (map.size() == k) {
                maxsum = Math.max(maxsum, sum);
            }
            
            map.put(nums[low], map.get(nums[low]) - 1);

            if (map.get(nums[low]) == 0){
                map.remove(nums[low]);           
                }
            sum -= nums[low];
            low++;
            }
            if(maxsum == Integer.MIN_VALUE){
                return 0;
            }
            return maxsum;
        }
}
