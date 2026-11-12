import java.util.*;

class Solution {
    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String current = "";
        int k = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            }

            else if (ch == '[') {
                countStack.push(k);
                stringStack.push(current);

                k = 0;
                current = "";
            }

            else if (ch == ']') {
                int count = countStack.pop();
                String previous = stringStack.pop();

                StringBuilder temp = new StringBuilder(previous);

                for (int j = 0; j < count; j++) {
                    temp.append(current);
                }

                current = temp.toString();
            }

            else {
                current += ch;
            }
        }

        return current;
    }
}