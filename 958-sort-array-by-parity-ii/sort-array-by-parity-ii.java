class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int EP = 0;
        int OP = 1;
        while(EP<n && OP<n){
            if(nums[EP]%2 == 0){
                EP+=2;
                
            }
            else if(nums[OP]%2 != 0){
                OP+=2;
                
            }
            else{
                int temp = nums[EP];
                nums[EP] = nums[OP];
                nums[OP] = temp;
                OP+=2;
                
                EP+=2;
                
            }
        }
        return nums;
    }
}