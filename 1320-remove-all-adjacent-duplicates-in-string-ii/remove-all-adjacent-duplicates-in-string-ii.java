import java.util.*;
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Map.Entry<Character,Integer>> sack = new Stack<>();
        int n = s.length();
        //storing the character and its count in pair
        for (int i=0;i<n;i++){
            /*if(sack.empty()){
                sack.push(new AbstractMap.SimpleEntry<>(s.charAt(i),1));
                continue;
            }
            if(sack.peek().getKey()!=s.charAt(i)){
                sack.push(new AbstractMap.SimpleEntry<>(s.charAt(i),1));
                continue;
            }*/
            if(sack.empty() || sack.peek().getKey()!=s.charAt(i)){
                sack.push(new AbstractMap.SimpleEntry<>(s.charAt(i),1));
                continue;
            }//this works but the sequence should be correct first check empty then next reverse wont work

            if(sack.peek().getKey()==s.charAt(i) && sack.peek().getValue()==k-1){
                sack.pop();
                continue;
            }
            if(sack.peek().getKey()==s.charAt(i) && sack.peek().getValue()<k){
                sack.peek().setValue(sack.peek().getValue() +1);
                continue;
            }//the sequence of this last 2 ifs statements hould be proper cause if one gets executed other wont 
        }
        StringBuilder res = new StringBuilder();
        while(!sack.empty()){
            int count = sack.peek().getValue();
            Character c = sack.peek().getKey();
            while(count!=0){
                res.append(c);
                count--;
            }
            sack.pop();
        }
        return res.reverse().toString();
    }
}