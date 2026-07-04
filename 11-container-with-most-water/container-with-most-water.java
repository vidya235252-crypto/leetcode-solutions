class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int max=0;
        while(left<right){
            int vol=Math.min(height[left],height[right])*(right-left);
            max=Math.max(vol,max);
            if(height[left]<height[right])
            left++;
            else
            right--;
        }
    return max;
    }
}