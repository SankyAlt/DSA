class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        int low = 0;
        int high = 9;
        List<String> ans = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        HashSet<String> repeatedans = new HashSet<>();
        //String sub = s.substring(0,10);
        //set.add(sub);
        while(high<n){
            String helo = s.substring(low,high+1);
            if(set.contains(helo)){
                /*if(!repeatedans.contains(helo)){
                    ans.add(helo);
                    repeatedans.add(helo);
                }*/
                if(repeatedans.add(helo)){
                    ans.add(helo);
                }
            }
            else{
                set.add(helo);
            }
            low++;
            high++;
        }
        return ans;
    }
}