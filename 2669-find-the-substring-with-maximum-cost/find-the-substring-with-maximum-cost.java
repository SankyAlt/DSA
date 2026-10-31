class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        int[] map = new int[26];
        for(int i=0;i<26;i++){
            map[i] = i+1;//index 0 = a value =1
        }
        for(int i =0;i<chars.length();i++){
            map[chars.charAt(i)-'a'] = vals[i]; //override the custom vals
        }
        int bestending = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++){
            int v1 = map[s.charAt(i)-'a'];
            int v2 = bestending + map[s.charAt(i)-'a'];
            bestending = Math.max(v1,v2);
            ans = Math.max(ans,bestending);
        }
        return ans;
    }
}