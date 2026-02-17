class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ans = new int[nums.length];
        
        ans[0] = 1;
        for(int i=1; i<nums.length; i++){
            ans[i] = ans[i-1]*nums[i-1];
        }//left mult of each elements is stored in ans
        
        int right = 1;

        //without storing right mults
        for(int j=nums.length-1; j>=0; j--){
            ans[j] = ans[j]*right;
            right = right*nums[j];
            
        }
        
        return ans;

    }
}