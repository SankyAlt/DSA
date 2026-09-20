class Solution {
    public String makeGood(String s) {
        Stack<Character> sack = new Stack<>();

        for (char item : s.toCharArray()) {

            if (!sack.empty() && Math.abs(item - sack.peek()) == 32) {
                sack.pop();
            }
            else {
                sack.push(item);
            }
        }

        StringBuilder res = new StringBuilder();

        while (!sack.empty()) {
            res.append(sack.pop());
        }

        return res.reverse().toString();
    }
}