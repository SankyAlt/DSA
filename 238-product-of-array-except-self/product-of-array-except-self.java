class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ans = new int[nums.length];
        int[] right = new int[nums.length];
        ans[0] = 1;
        for(int i=1; i<nums.length; i++){
            ans[i] = ans[i-1]*nums[i-1];
        }//left mult of each elements is stored in ans
        
        right[nums.length-1] = 1;
        for(int j=nums.length-1-1; j>=0; j--){
            right[j] = right[j+1]*nums[j+1];
            
        }//right mult of each element is stored in right
        for(int k=0; k<nums.length; k++){
            ans[k] = ans[k]*right[k];
        }
        return ans;

    }
}