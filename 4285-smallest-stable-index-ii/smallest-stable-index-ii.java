class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            a[i]=max;
        }
        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            b[i]=min;
        }
        for(int i=0;i<n;i++){
            int temp=a[i]-b[i];
            if(temp<=k)
            return i;
        }
        return -1;
    }
}