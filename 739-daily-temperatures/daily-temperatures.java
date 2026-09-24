class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> sack = new Stack<>();
        int[] res = new int[n];
        res[n-1] = 0; // for last element
        sack.push(n-1);//we are pushing the index
         for (int i=n-2;i>=0;i--){
            while(!sack.empty() && temperatures[sack.peek()]<=temperatures[i]){
                sack.pop();
            }
            if(!sack.empty()){
                int days = sack.peek() - i;
                res[i] = days;
            }
            else{
                res[i]=0;
            }
            sack.push(i); 
        }
        return res;
    }
}