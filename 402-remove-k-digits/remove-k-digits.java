import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {

            char digit = num.charAt(i);

            while (!stack.isEmpty() && k > 0 &&
                   stack.peek() > digit) {
                stack.pop();
                k--;
            }

            stack.push(digit);
        }

        // Remove remaining digits from the end
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Build result
        StringBuilder sb = new StringBuilder();

        for (char c : stack) {
            sb.append(c);
        }

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}