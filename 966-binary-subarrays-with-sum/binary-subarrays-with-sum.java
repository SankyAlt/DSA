class Solution {
    private int atmost(int[] nums, int goal){
        if(goal<0){return 0;}
        int low = 0;
        int n = nums.length;
        int sum = 0;
        int count = 0;
        for (int high = 0;high<n;high++){
            sum+= nums[high];
            while (sum>goal){
                sum-= nums[low];
                low++;
            }
            count = count + high - low +1;

        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
       return atmost(nums,goal) - atmost(nums,goal-1);
    }
}