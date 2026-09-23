class Solution {//finding next greater starting from any element in circular gives same result
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> sack = new Stack<>();
        for (int i=n-2;i>=0;i--){ //for nums = [1,2,3,4,3] sackshould be already filled as bottom to top as 3,1,2,3<-top and run for loop from i = n-1
            sack.push(nums[i]);
        }
        
        /*int max = Arrays.stream(nums).max().getAsInt();
        if (max != nums[n - 1]) {
            res[n - 1] = max;
        } else {
            res[n - 1] = -1;
        }*///this wont work
        
        for (int i = n - 1; i >= 0; i--) {
            while (!sack.empty() && sack.peek() <= nums[i]) {
                sack.pop();
            }
            if (sack.empty()) {
                res[i] = -1;
            } else {
                res[i] = sack.peek();
            }
            sack.push(nums[i]);
        }
        return res;
    }
}