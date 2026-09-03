class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int res = 0;
        int n = nums.length;
        map.put(0,map.getOrDefault(0,0)+1);//increases the freq of 0sum to 1
        for (int i=0;i<n;i++){
            
            sum += nums[i];
            int ques = sum - k;
            //int freq = map.get(sum-k,map.getOrDefault(sum-k,0)+1);we cannot get and put/change values at same timw
            int freq = map.getOrDefault(sum-k,0);
            res += freq;
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}