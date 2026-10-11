class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int right = n-1;
        int left = 0;
        int count = 0;
        while(right>=left){
            if(people[left]+people[right]<=limit){
                left++;
            }
            count++;
            right--;
        }
        return count;
    }
}
