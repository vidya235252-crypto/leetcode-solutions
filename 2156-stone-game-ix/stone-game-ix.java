class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] a=new int[3];
        for(int x:stones){
            if(x%3==0)
            a[0]++;
            else if(x%3==1)
            a[1]++;
            else
            a[2]++;
        }
        if(a[0]%2==0)
        return a[1]>0 && a[2]>0;
        return Math.abs(a[1]-a[2])>2;
    }
}