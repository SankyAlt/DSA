class Solution {
    public boolean isVowel(int i){
        if(i == 'a'||i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int high = s.length()-1;
        int low = 0;
        char[] arr = s.toCharArray();
        while(low<high){
            while(low<high && !isVowel(arr[low])){
                low++;
            }
            while(low<high && !isVowel(arr[high])){
                high--;
            }

            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return new String(arr);
    }
}