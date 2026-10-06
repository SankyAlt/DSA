class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            // Add the new character entering the window
            if (isVowel(s.charAt(i))) {
                count++;
            }

            // Remove the character leaving the window
            if (i >= k) {
                if (isVowel(s.charAt(i - k))) {
                    count--;
                }
            }

            // Update maximum once window reaches size k
            if (i >= k - 1) {
                max = Math.max(max, count);
            }
        }

        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}