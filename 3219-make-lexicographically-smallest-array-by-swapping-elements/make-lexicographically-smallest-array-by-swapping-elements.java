class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n=nums.length;
        Integer[] s=new Integer[n];
        for(int i=0;i<n;i++){
            s[i]=i;
        }
        Arrays.sort(s,(a,b)->nums[a]-nums[b]);
        int left=0;
        while(left<n){
            int right=left;
            while(right+1<n && nums[s[right+1]]-nums[s[right]]<=limit)right++;
            List<Integer> list=new ArrayList<>();
            List<Integer> vals=new ArrayList<>();
            for(int i=left;i<=right;i++){
                list.add(s[i]);
                vals.add(nums[s[i]]);
            }
            Collections.sort(list);
            for(int i=0;i<list.size();i++){
                nums[list.get(i)] = vals.get(i);
            }
            left=right+1;
        }
        return nums;
    }
}