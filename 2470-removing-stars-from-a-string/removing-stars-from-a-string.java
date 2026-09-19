class Solution {
    public String removeStars(String s) {
        Stack<Character> sack = new Stack<>();

        for (char item : s.toCharArray()) {
            if (item == '*') {
                sack.pop();
            } else {
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