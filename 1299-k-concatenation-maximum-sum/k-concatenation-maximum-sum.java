class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        int n = arr.length;
        int maxsum1 = 0;
        int bestending = 0;
        int sum = 0;
        
        for(int i=0;i<n;i++){
            int v1 = arr[i];
            int v2 = arr[i] + bestending;
            bestending = Math.max(v2,v1);
            maxsum1 = Math.max(bestending,maxsum1);
            sum += arr[i];
            
        }
        if(k==1){
            return maxsum1;
        }
        int[] arr2 = new int[2*n];
        for(int i=0;i<2*n;i++){
            if(i>=n){
                arr2[i] = arr[i-n];
            }
            else{
                arr2[i] = arr[i];
            }
        }
        int bestending2 = 0;
        long maxsum2 = 0;
        for(int i=0;i<n*2;i++){
            int v1 = arr2[i];
            int v2 = bestending2 + arr2[i];
            bestending2 = Math.max(v1,v2);
            maxsum2 = Math.max(maxsum2,bestending2);
        }
        
        if(sum>0){
            maxsum2 += (long)sum*(k-2);
        }
        long ans = maxsum2;
        return (int)(ans % 1_000_000_007);


        
    }
}