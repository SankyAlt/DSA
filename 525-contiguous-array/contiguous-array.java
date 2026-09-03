class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int one = 0;
        int zero = 0;
        int longest = 0;
        HashMap<Integer,Integer> map = new HashMap<>(); //we have to store the diff and on which ith position it was on.
        for (int i=0;i<n;i++){
            one += nums[i];
            zero = i+1-one;
            /*if (a[i]==1){
                one++;
            }
            else{
                zero++;
            }*/
            int diff = one-zero ;
            if (diff == 0){
                int len = i+1;
                longest = Math.max(len,longest);
                continue;//to break for loop for current i.
            }
            if (map.containsKey(diff)){
                int len = i - map.get(diff);
                longest = Math.max(len,longest);
            }
            else{
                map.put(diff,i);
            }
        }
        return longest;
    }
}