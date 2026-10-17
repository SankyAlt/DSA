class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pfreq = new int[26];
        int[] sfreq = new int[26];
        List<Integer> ans = new ArrayList<>();
        int n = p.length();
        int m = s.length();
        if(n>m){
            return ans;
        }
        for (int i = 0; i < n; i++) {
            pfreq[p.charAt(i) - 'a']++;
        }
        int low = 0;
        int high = n-1;
        for (int i = low; i <= high; i++) {
            sfreq[s.charAt(i) - 'a']++;
        }
        while (high < m) {
            if (Arrays.equals(sfreq, pfreq)) {
                ans.add(low);
            }

            sfreq[s.charAt(low) - 'a']--;
            low++;
            high++;
            if(high>=m){
                break;
            }
            sfreq[s.charAt(high) - 'a']++;
        }
        return ans;
    }
}