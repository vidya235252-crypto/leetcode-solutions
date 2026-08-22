class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n,sum=0,prod=1;
        while(n!=0){
            int i=n%10;
            sum+=i;
            prod*=i;
            n=n/10;
        }
        int x=sum+prod;
        return temp%x==0;
    }
}