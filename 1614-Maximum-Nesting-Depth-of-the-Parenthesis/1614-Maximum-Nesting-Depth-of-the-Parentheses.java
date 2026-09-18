class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);

            if (item == '(') {
                count++;
                max = Math.max(max, count);
            }
            else if (item == ')') {
                count--;
            }
        }

        return max;
    }
}
