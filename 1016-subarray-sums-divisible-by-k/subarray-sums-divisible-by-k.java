class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i=0;i<n;i++){
            sum += nums[i];
            //int ques = sum%k; this will not work if sum is negative 
            int ques = Math.floorMod(sum,k);
            int freq = map.getOrDefault(ques,0);//this line means get freq of sum%k, if not exist in map return 0
            res += freq;
            //map.put(sum,map.getOrDefault(sum,0)+1); we have to store remainders ques not sum
            map.put(ques,map.getOrDefault(ques,0)+1);
        }
        return res;
    }
}