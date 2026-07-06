class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,subarray=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int remove=sum-k;
            if(map.containsKey(remove)){
                subarray=subarray+map.get(remove);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return subarray;
    }
}