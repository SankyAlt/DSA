class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int low = 0;
        int sum1 = 0;
        int sum0 = 0;
        int maxsum1 = 0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                sum0+=customers[i];
            }
        }

        for(int i=0;i<minutes-1;i++){
            if(grumpy[i]==1){
                sum1+=customers[i];
            }
        }

        for(int high=minutes-1;high<n;high++){
            if(grumpy[high]==1){
                sum1 += customers[high];
            }
            maxsum1 = Math.max(sum1,maxsum1);
            if(grumpy[low]==1){
                sum1-=customers[low];
            }
            low++;
            
        }
        return sum0+maxsum1;
    }
}