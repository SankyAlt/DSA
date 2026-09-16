class Solution {
    public boolean isValid(String s) {
        Stack<Character> sack = new Stack<>();
        int n = s.length();

        /*char ch = s.charAt(0);
        if (ch == ')' || ch == '}' || ch == ']'){
            return false;
        }*/

        for (int i = 0; i < n; i++) {
            char item = s.charAt(i);

            
            if(item == '(' || item == '{' || item == '['){
                sack.push(item);
                continue;
            }
            if (sack.empty()){///// if stack is empty and curr item is closing bracket//////
                return false;
            }
            if(item == ')' && sack.peek()=='('){
                sack.pop();
            }
            else if(item == '}' && sack.peek()=='{'){///else if not just if
                sack.pop();
            }
            else if(item == ']' && sack.peek()=='['){
                sack.pop();
            }
            else{ ///////// if upper 3 conditions fail then false
                return false;
            }
            
            
            
            
        }
        if (sack.empty()){
            return true;
        }
        else{
            return false;
        }
        
    }
}