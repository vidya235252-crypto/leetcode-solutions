class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        int count=0;
        List<int[]> res=new ArrayList<>();
        res.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] last=res.get(res.size()-1);
            if(intervals[i][0]<last[1]){
            last[1]=Math.min(last[1],intervals[i][1]);
            count++;
            }
            else
            res.add(intervals[i]);
        }
        return count;
    }
}