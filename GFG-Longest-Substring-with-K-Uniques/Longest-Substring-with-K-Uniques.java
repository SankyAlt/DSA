class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int high = 0;
        int low = 0;
        int n = s.length();
        int maxs = -1;
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (high = 0; high < n; high++){
            map.put(s.charAt(high), map.getOrDefault(s.charAt(high), 0) + 1);
            
            while (map.size() > k){
                map.put(s.charAt(low), map.get(s.charAt(low)) - 1);
                if (map.get(s.charAt(low)) == 0){
                    map.remove(s.charAt(low));
                }
                low++;
            }
            if (map.size() == k){
                res = high - low + 1;
                maxs = Math.max(maxs,res);
            }
            
        }return maxs;
        
    }
}
