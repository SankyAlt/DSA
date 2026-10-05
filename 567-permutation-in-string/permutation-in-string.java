class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        //here the permutation should also be contiguously found in s2
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<n;i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
        }
        int currWinLen = 0;
        for(int i=0;i<m;i++){
            
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
            currWinLen++;
            if(currWinLen>n){
                map2.put(s2.charAt(i-n),map2.get(s2.charAt(i-n))-1);
                currWinLen--;
                if(map2.get(s2.charAt(i-n))==0){
                    map2.remove(s2.charAt(i-n));
                }
            }

            if(map1.equals(map2)){
                return true;
            }
                
            
        }
        return false;
    }
}