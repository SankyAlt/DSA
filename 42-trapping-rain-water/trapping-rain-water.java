class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int water = 0;
        int maxleft = 0;
        int maxright = 0;
        
        while(left<right){
            if(height[right]>=height[left]){
                if(height[left]<maxleft){
                    water = water + maxleft - height[left];
                }
                else{
                    maxleft = height[left];
                    
                }
                left++;
            }
            else{
                if(height[right]<maxright){
                    water = water + maxright - height[right];
                }
                else{
                    maxright = height[right];
                }
                right--;
            }
            
        }
return water;

    }
}