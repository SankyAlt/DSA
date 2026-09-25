class Solution {
    public int isUnique(String s,int n,HashMap<Character,Integer> f){
        for (int i=0;i<n;i++){
            if(f.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> f = new HashMap<>();
        int n = s.length();
        for (int i=0;i<n;i++){
            f.put(s.charAt(i),f.getOrDefault(s.charAt(i),0)+1);
        }
        return isUnique(s,n,f);
    }
}