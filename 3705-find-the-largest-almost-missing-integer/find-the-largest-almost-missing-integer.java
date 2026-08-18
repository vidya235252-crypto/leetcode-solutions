class Solution {
    public int largestInteger(int[] nums, int k) {
        int res=-1;
        if(k==nums.length){
            for(int x:nums)
            res=Math.max(res,x);
            return res;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        if(k==1){
            for(int x:nums){
                if(map.get(x)==1)
                res=Math.max(res,x);
            }
            return res;
        }
        if(map.get(nums[0])==1)
        res=Math.max(res,nums[0]);
        if(map.get(nums[nums.length-1])==1)
        res=Math.max(res,nums[nums.length-1]);
        return res;
    }
}