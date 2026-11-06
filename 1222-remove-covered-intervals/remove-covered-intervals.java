class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        if (intervals.length == 0) return 0;

        Arrays.sort(intervals, (a,b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int maxEnd = 0;
        int count = 0;

        for (int i = 0; i < intervals.length; i++) {

            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            if (end2 > maxEnd) {
                count++;
                maxEnd = end2;
            }
        }

        return count;
    }
}