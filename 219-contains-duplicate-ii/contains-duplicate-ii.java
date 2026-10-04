class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        /*HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i=0;i<n;i++){
            if ( map.containsKey(nums[i])){
                int previousindex =map.get(nums[i]);
                if(i-previousindex<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;*///this uses o(n) and space o(n)
        //following solution is o(n) and space o(k) using sliding 
        // this solutions logic is to find whether theres duplicate within the distance less than or equal to k

        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}