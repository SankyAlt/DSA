class Solution {
    /*public boolean fun(have,need){
        for(char c : need.keySet()){
            if(need.get(c)>have.getOrDefault(c,0)){
                return false;
            }
            
        }
        return true;
    }*/
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> have = new HashMap<>();
        int ransomlen = ransomNote.length();
        int magazinelen = magazine.length();
        for (int i=0;i<ransomlen;i++){
            need.put(ransomNote.charAt(i),need.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for (int i=0;i<magazinelen;i++){
            have.put(magazine.charAt(i),have.getOrDefault(magazine.charAt(i),0)+1);
        }
        for (int i=0;i<ransomlen;i++){
            char c = ransomNote.charAt(i);
            if(need.get(c)>have.getOrDefault(c,0)){
                return false;
            }
        }
        //return fun(have,need);
        return true;
    }
    
}
//best approach is to use single onr int[26] by first storing the have++ and then need-- , if int[26] contains -1 or any negative return false
/*class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        // Count available characters in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        // Use characters for ransomNote
        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;

            if (count[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}*/