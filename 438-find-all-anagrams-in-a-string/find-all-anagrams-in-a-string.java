
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int[] pFreq = new int[26];
        int[] sFreq = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pFreq[p.charAt(i) - 'a']++;
            sFreq[s.charAt(i) - 'a']++;
        }

        int k = p.length();

        for (int high = k; high < s.length(); high++) {
            if (Arrays.equals(pFreq, sFreq)) {
                ans.add(high - k);
            }

            sFreq[s.charAt(high) - 'a']++;
            sFreq[s.charAt(high - k) - 'a']--;
        }

        if (Arrays.equals(pFreq, sFreq)) {
            ans.add(s.length() - k);
        }

        return ans;
    }
}
