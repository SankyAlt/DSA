class Solution {
    public boolean validPalindrome(String s) {
        int count = 1;
        boolean palin = true;
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (count > 0) {
                    return isPalindrome(s, left + 1, right) ||
                            isPalindrome(s, left, right - 1);
                }

                else {
                    palin = false;
                    return palin;
                }
            }

            else if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }

        }
        return palin;
    }
    private boolean isPalindrome(String s, int left, int right){
    while(left < right){
        if(s.charAt(left) != s.charAt(right))
            return false;
        left++;
        right--;
    }
    return true;
}

}