class Solution {
    public boolean isEven(int hello){
        if(hello%2==0){
            return true;
        }
        return false;
    }
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
       
        int low = 0;
        int high = n-1;
        while(low<high){
            int hello = nums[low];
            if(isEven(hello)){
                low++;
            }
            else if(!isEven(hello)){
                int temp = hello;
                nums[low] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    return nums;
    }
}