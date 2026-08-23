class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0;

        int n = fruits.length;
        int maxfruits = -1;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int high = 0; high < n; high++) {
            map.put(fruits[high], map.getOrDefault(fruits[high], 0) + 1);
            while (map.size() > 2) {
                map.put(fruits[low], map.get(fruits[low]) - 1);
                if (map.get(fruits[low]) == 0) {
                    map.remove(fruits[low]);
                }
                low++;
            }
            if (map.size() <= 2) {
                res = high - low + 1;
                maxfruits = Math.max(maxfruits, res);
            }
        }
        return maxfruits;
    }
}