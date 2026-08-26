class Solution {
    private int atmost(int[] nums,int k){
        int low = 0;
        int n = nums.length;
        int total = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int high = 0;high<n; high++){
            map.put(nums[high], map.getOrDefault(nums[high], 0) + 1);

            while (map.size() > k){
                map.put(nums[low],map.getOrDefault(nums[low],0)-1);
                if (map.get(nums[low]) == 0){
                    map.remove(nums[low]);
                }
                low++;
            }
            total = total + high - low +1;
        }return total;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums,k-1);


    }
}