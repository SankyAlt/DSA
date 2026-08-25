class Solution {
    public int longestOnes(int[] nums, int k) {
        int low = 0;
        int n = nums.length;
        int max1s = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,0);
        map.put(0,0);
        for (int high = 0; high < n; high++){
            map.put(nums[high],map.getOrDefault(nums[high],0)+1);
            int len = high - low +1;
            int freqzero = map.get(0);
            while (freqzero > k){
                map.put(nums[low], map.get(nums[low])-1);  
                low++;
                len = high - low +1;
                freqzero = map.get(0);
            }
            //if (freqzero <= k){
                max1s = Math.max(max1s, len);
            //}
            
        }return max1s;

    }
}