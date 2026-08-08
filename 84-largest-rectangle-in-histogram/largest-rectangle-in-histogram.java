class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int maxarea=0;
        int n=heights.length;
        for(int i=0;i<=n;i++){
            int curheight=(i==n)?0:heights[i];
            while(!stack.isEmpty() && curheight<heights[stack.peek()]){
                int top=stack.pop();
                int h=heights[top];
                int left;
                if(stack.isEmpty())
                left=-1;
                else
                left=stack.peek();
                int width=i-left-1;
                int area=h*width;
                if(area>maxarea)
                maxarea=area;
            }
            stack.push(i);

        }
        return maxarea;
    }
}