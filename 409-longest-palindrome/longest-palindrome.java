class Solution {

    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        for (int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        boolean oddpresent = false;
        for (char c : map.keySet()){
            if ( map.get(c) % 2 !=0){
                count += map.get(c) -1;
                oddpresent = true;
            }
            else{
                count += map.get(c);
            }
        }
        if (oddpresent){
            //return count++;
            return ++count;
        }
        else{
            return count;
        }
    }
}