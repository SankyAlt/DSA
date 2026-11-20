class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> sack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch =='('){
                //dont add to result cause its outermost
                if(!sack.isEmpty()){
                    res.append(ch);
                }
                sack.push(ch);
                  
            }
            else{
                sack.pop();
                if(!sack.isEmpty()){
                    
                    res.append(ch);
                }
                

            }
        }
        return res.toString();
    }
}
