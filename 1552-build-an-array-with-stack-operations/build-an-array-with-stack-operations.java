class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> sack = new Stack<>();
        ArrayList<String> res = new ArrayList<>();
        int q = target.length;
        int j =0;
        for (int i = 1; i <= n; i++) {
            if (j<q) {
                if (i == target[j]) {
                    res.add("Push");
                    j++;
                } else {
                    res.add("Push");
                    res.add("Pop");
                }
            }

        }
        return res;
    }
}