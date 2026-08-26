class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        String res="";
        int min=Integer.MAX_VALUE;
        int left=0,ones=0;
        for(int right=0;right<n;right++){
            if(s.charAt(right)=='1')ones++;
            while(ones==k){
                int len=right-left+1;
                if(len<min){
                    min=len;
                    res=s.substring(left,right+1);
                }else if(len==min){
                    String x=s.substring(left,right+1);
                    if(x.compareTo(res)<0)res=x;
                }
                if(s.charAt(left)=='1')ones--;
                left++;
            }
        }
        return res;
    }
}