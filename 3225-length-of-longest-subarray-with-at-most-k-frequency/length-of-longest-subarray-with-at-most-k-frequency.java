class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0,size=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.get(nums[i])>k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            size=Math.max(size,i-left+1);
        }
        return size;
    }
}