class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if(nums==null || nums.length==0) return new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        permutation(res,nums,visited,new ArrayList());
        return res;
    }
    private void permutation(List<List<Integer>> res,int[] nums,boolean[] visited,List<Integer> temp){
        if(temp.size()==nums.length) res.add(new ArrayList(temp));
        for(int i=0;i<nums.length;i++){
            if(visited[i])continue;
            visited[i]=true;
            temp.add(nums[i]);
            permutation(res,nums,visited,temp);
            visited[i]=false;
            temp.remove(temp.size()-1);
        }
    }
}