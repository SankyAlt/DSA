class Solution {
    public String simplifyPath(String path) {
        Stack<String> sack = new Stack<>();
        String[] parts = path.split("/");
        for(String part : parts){
            if(part.equals("") || part.equals(".")){
                continue;
            }
            /*else if(part.equals("..") && !sack.empty()){
                sack.pop();
            }*/
            else if(part.equals("..")){
                if(!sack.empty()){
                    sack.pop();
                }
            }
            else{
                sack.push(part);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String abc : sack ){
            sb.append("/");
            sb.append(abc);
        }
        if(sb.length() == 0){
            return "/";
        }
        else{
            return sb.toString();
        }
        
    }
}