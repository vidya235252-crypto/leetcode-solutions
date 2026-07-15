class Solution {
    public String longestPalindrome(String s) {
        int start=0,maxlen=0;
        for(int center=0;center<s.length();center++){
            int len1=ExpandAroundCentre(s,center,center);
            int len2=ExpandAroundCentre(s,center,center+1);
            int len=Math.max(len1,len2);
            if(len>maxlen){
                maxlen=len;
                start=center-(len-1)/2;
            }
        }
        return s.substring(start,start+maxlen);
    }
    private int ExpandAroundCentre(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}