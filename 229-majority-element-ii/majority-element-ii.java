import java.util.HashMap;
//sanky checking
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int m = nums.length/3;
        ArrayList<Integer> majors = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num)>m && !majors.contains(num)){
                majors.add(num);
            
            }
            
        }return majors;
    }
}