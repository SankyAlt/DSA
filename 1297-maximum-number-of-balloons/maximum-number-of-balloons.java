class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] have = new int[26];
        int[] need = new int[26];
        String want = "balloon";
        int res = Integer.MAX_VALUE;
        int n = text.length();
        for (char c : text.toCharArray()){
            have[c-'a']++;
        }
        for (char c : want.toCharArray()){
            need[c-'a']++;
        }
        for (char c : want.toCharArray()){
            int times = have[c-'a']/need[c-'a'];
            res = Math.min(res,times);
        }
        return res;
    }
}