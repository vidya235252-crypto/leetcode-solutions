class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] max=new int[n];
        int[] min=new int[n];
        max[0]=nums[0];
        min[n-1]=nums[n-1];
        for(int i=1,j=n-2;i<n;i++,j--){
            max[i]=Math.max(max[i-1],nums[i]);
            min[j]=Math.min(min[j+1],nums[j]);
        }
        for(int i=0;i<n;i++){
            int x=max[i]-min[i];
            if(x<=k){
                return i;
            }
        }
        return -1;
    }
}