class Solution {
    public int longestSubsequence(int[] nums) {
        int res=0,n=nums.length;
        boolean nonzero=false;
        for(int i=0;i<n;i++){
            nonzero|=nums[i]>0;
            res^=nums[i];
        }
        if(!nonzero)return 0;
        return res==0?n-1:n;
    }
}