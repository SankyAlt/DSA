class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean odd = false;

        for (char c : map.keySet()) {

            int count = map.get(c);

            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                odd = true;
            }
        }

        if (odd) {
            length++;
        }

        return length;
    }
}