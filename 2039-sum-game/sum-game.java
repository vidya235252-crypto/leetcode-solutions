class Solution {
    public boolean sumGame(String num) {
        int n=num.length(),sumleft=0,sumright=0,l=0,r=0;
        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?')l++;
            else sumleft+=num.charAt(i)-'0';
        }
        for(int i=n/2;i<n;i++){
            if(num.charAt(i)=='?')r++;
            else sumright+=num.charAt(i)-'0';
        }
        int d=sumleft-sumright;
        int total=l+r;
        if(total%2!=0)return true;
        int a=9*(l-r)/2;
        return d+a!=0;
    }
}