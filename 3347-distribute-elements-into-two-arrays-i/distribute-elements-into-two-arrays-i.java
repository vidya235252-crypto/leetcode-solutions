class Solution {
    public int[] resultArray(int[] nums) {
        int[] res=new int[nums.length];
        Deque<Integer> a=new ArrayDeque<>();
        Deque<Integer> b=new ArrayDeque<>();
        a.addLast(nums[0]);
        b.addLast(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(a.peekLast()>b.peekLast()){
                a.addLast(nums[i]);
            }
            else
            b.addLast(nums[i]);
        }
        int i=0;
        while(!a.isEmpty()){
            res[i]=a.poll();
            i++;
        }
        while(!b.isEmpty()){
            res[i]=b.poll();
            i++;
        }
        return res;
    }
}