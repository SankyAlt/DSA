class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();

        int num = 1;

        for (int i = 0; i < target.length; i++) {

            while (num < target[i]) {
                res.add("Push");
                res.add("Pop");
                num++;
            }

            res.add("Push");
            num++;
        }

        return res;
    }
}