class Solution {
    public int maxDepth(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        int res=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(')
            stack.push(c);
            if(c==')'){
                res=Math.max(res,stack.size());
                stack.pop();
            }
        }
        return res;
    }
}