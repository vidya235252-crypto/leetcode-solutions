class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            int temp[]=nums1;
            nums1=nums2;
            nums2=temp;
        }
        int m=nums1.length,n=nums2.length;
        int low=0,high=m;
        while(low<=high){
            int x=(low+high)/2;
            int y=((m+n+1)/2)-x;
            int nums1left=(x==0)? Integer.MIN_VALUE:nums1[x-1];
            int nums1right=(x==m)? Integer.MAX_VALUE:nums1[x];
            int nums2left=(y==0)? Integer.MIN_VALUE:nums2[y-1];
            int nums2right=(y==n)? Integer.MAX_VALUE:nums2[y];
            if(nums1left<=nums2right && nums2left<=nums1right){
                if((m+n)%2==0)
                return (Math.max(nums1left,nums2left)+Math.min(nums1right,nums2right))/2.0;
                else
                return Math.max(nums1left,nums2left);
            }
            else if(nums1left>nums2right) high=x-1;
            else low=x+1;
        }
        return 0.0;
    }
}