class Solution {
    boolean check(int[] have, int[] needed){
            for (int i = 0; i < have.length; i++) {
                if (have[i] < needed[i]){
                    return false;
                }
            }
            return true;
    }
    public String minWindow(String s, String t) {
        int low = 0;
        int m = s.length();
        int res = Integer.MAX_VALUE;
        int start = 0;
        int[] have = new int[256];
        int[] needed = new int[256];
        for (char ch : t.toCharArray()) {
            needed[ch]++;
        }
        
        for (int high = 0; high < m; high++) {
            have[s.charAt(high)]++;
            
            while ( check(have,needed)){
                int len = high - low +1;
                if (len < res) {
                    res = len;
                    start = low;
                }
                have[s.charAt(low)]--;
                low++;
            }

        }
        if (res == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + res);
    }
}