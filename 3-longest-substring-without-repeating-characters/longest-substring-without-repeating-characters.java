class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int n = s.length();
        int longs = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int high = 0; high < n; high++){
            map.put(s.charAt(high), map.getOrDefault(s.charAt(high),0)+1);
            int len = high - low + 1;
            
            while (map.size() < len){
                map.put(s.charAt(low),map.get(s.charAt(low))-1);
                if (map.get(s.charAt(low)) == 0){
                    map.remove(s.charAt(low));
                }
                low++;
                len = high - low + 1;
            }
            if (map.size() == len){
                longs = Math.max(longs, len);
            }
        }
        if (s.length() == 0){
                return 0;
            }
        return longs;
    }
}