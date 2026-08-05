class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack=new ArrayDeque<>();
        for(String i:tokens){
            if(i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/"))
            stack.push(calc(i.charAt(0),stack.pop(),stack.pop()));
            else
            stack.push(Integer.parseInt(i));
        }
        return stack.peek();
    }
    public int calc(char op,int b,int a){
        int result=switch(op)
        {
            case '+' -> a+b;
            case '-' -> a-b;
            case '*' -> a*b;
            default -> a/b;
        };
        return result;
    }
}