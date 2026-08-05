class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res=new int[temperatures.length];
        int k=0;
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int j=stack.peek();
                res[j]=i-j;
                stack.pop();
            }
            stack.push(i);
        }
        return res;

    }
}