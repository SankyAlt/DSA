class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        ArrayList<int[]> res = new ArrayList<>();
        ArrayList<int[]> newintervals = new ArrayList<>();
        boolean insert = false;
        for (int i=0;i<n;i++){
            int start = intervals[i][0];
            if (insert == false && start >= newInterval[0]){
                newintervals.add(new int[]{newInterval[0],newInterval[1]});
                insert = true;
            }
            newintervals.add(new int[]{intervals[i][0],intervals[i][1]});
        }
        if (insert == false){
            newintervals.add(new int[]{newInterval[0],newInterval[1]});
        }
        int start1 = newintervals.get(0)[0];
        int end1 = newintervals.get(0)[1];
        for (int i=1;i<n+1;i++){
            int start2 = newintervals.get(i)[0];
            int end2 = newintervals.get(i)[1];
            if (start2<=end1){
                start1 = start1;
                end1 = Math.max(end1,end2);
                continue;
            }
            res.add(new int[]{start1,end1});
            start1 = start2;
            end1 = end2;
            
        }
        res.add(new int[]{start1,end1});
        return res.toArray(new int[res.size()][]);
    }
}