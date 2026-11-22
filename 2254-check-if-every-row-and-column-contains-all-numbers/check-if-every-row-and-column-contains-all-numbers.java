class Solution {
    private boolean checkRow(HashSet<Integer> set,int[][] matrix,int j,int n){
        for(int i = 0;i<n;i++){
            
            set.add(matrix[j][i]);
        }
        if(set.size()!=n){
            return false;
        }
        set.clear();
        return true;
    }
    private boolean checkColumn(HashSet<Integer> set,int[][] matrix,int i,int n){
        for(int j = 0;j<n;j++){
            
            set.add(matrix[j][i]);
        }
        if(set.size()!=n){
            return false;
        }
        set.clear();
        return true;
    
    }
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        HashSet<Integer> set = new HashSet<>();
        for(int j=0;j<n;j++){
            if(!checkRow(set,matrix,j,n)){
                return false;
            }
        }
        for(int i=0;i<n;i++){
            if(!checkColumn(set,matrix,i,n)){
                return false;
            }
        }

        
        return true;
    }

}