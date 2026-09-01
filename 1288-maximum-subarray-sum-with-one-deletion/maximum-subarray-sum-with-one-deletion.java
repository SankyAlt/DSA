class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int onedelete = 0;
        int nodelete = arr[0];
        int res = arr[0];
        for (int i=1;i<n;i++){
            int oldnodelete = nodelete;
            int oldonedelete = onedelete;
            int v1 = arr[i];
            int v2 = oldnodelete + arr[i];
            int v3 = oldonedelete + arr[i];
            int v4 = oldnodelete ;// in oldnodelete current arr[i] is not included so no need to do oldnodelete - arr[i];
            onedelete = Math.max(v4,v3);
            nodelete = Math.max(v1,v2);
            res = Math.max(nodelete,Math.max(onedelete,res));
        }
        return res;
    }
}