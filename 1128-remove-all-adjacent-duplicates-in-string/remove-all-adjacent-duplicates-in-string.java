class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> sack = new Stack<>();
        StringBuilder res = new StringBuilder();
        
        for (int i=0;i<s.length();i++){
            char item = s.charAt(i);
            if (!sack.empty() && item == sack.peek()){
                sack.pop();
                continue;
            }
            sack.push(s.charAt(i));


        }
        while (!sack.empty()){
            res.append(sack.peek());
            sack.pop();
        }
        return res.reverse().toString();
        
    }
}