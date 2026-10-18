class Solution {
    public int minOperations(int[] nums, int x) {
        
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        int targetsum = sum - x;
        if(x>sum){
            return -1;
        }
        // we hav to find longest sub array in nums with sum<= x
        int low = 0;
        
        int reqsum = 0;
        int maxlen = -1;
        for (int high = 0;high <n; high++){
            reqsum += nums[high];
            while(reqsum>targetsum){
                reqsum -= nums[low];
                low++;
            }
            if(reqsum == targetsum){
                int len = high -low +1;
                maxlen = Math.max(maxlen,len);
            }
            
        }
        if(maxlen == -1){////when no longest subarray found which is equals to target sum
            return -1;
        }
        return n - maxlen;
    }
}