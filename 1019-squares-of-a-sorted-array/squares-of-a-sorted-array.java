class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        //sep neg and positive array
         for(int i = 0; i < nums.length; i++){
            if(nums[i]>= 0){
                positive.add(nums[i]);
            }
            else{
                negative.add(nums[i]);
            }
         }
        //all negative
        if (positive.size() == 0){
            for( int i = 0; i< negative.size(); i++){
            negative.set(i, negative.get(i) * negative.get(i));
            }
            Collections.reverse(negative);
                
            return negative.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
            
        }
        //all postive
        if (negative.size() == 0){
            for( int i = 0; i< positive.size(); i++){
            positive.set(i, positive.get(i) * positive.get(i));
            }
            return positive.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
            
        }
        // both pos and neg exists

        int[] res = new int[nums.length];

        //square positive
        for( int i = 0; i< positive.size(); i++){
            positive.set(i, positive.get(i) * positive.get(i));
        }

        // square neg and sort
        for( int i = 0; i< negative.size(); i++){
            negative.set(i, negative.get(i) * negative.get(i));
            }
        Collections.reverse(negative);
        
        // merge two sorted array using 2 pointers
        int i = 0;
        int j = 0;
        int k = 0;
        while(i< positive.size() && j< negative.size()){
            if(positive.get(i)<= negative.get(j)){
                res[k] = positive.get(i);
                i++;
                k++;
            }
            else{
                res[k] = negative.get(j);
                j++;
                k++;
            }

        }
        while(i<positive.size()){
            res[k] = positive.get(i);
            i++;
            k++;
        }
        while(j<negative.size()){
            res[k] = negative.get(j);
                j++;
                k++;
        }
        return res;





        
        


    }
}





















