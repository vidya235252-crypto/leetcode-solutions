class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n=stoneValue.length;
        int[] p=new int[n+1];
        for(int i=0;i<n;i++){
            p[i+1]=p[i]+stoneValue[i];
        }
        int[][] dp=new int[n][n];
        for(int len=2;len<=n;len++){
            for(int l=0;l+len<=n;l++){
                int r=l+len-1;
                for(int k=l;k<r;k++){
                    int leftsum=p[k+1]-p[l];
                    int rightsum=p[r+1]-p[k+1];
                    if(leftsum<rightsum){
                        dp[l][r]=Math.max(dp[l][r],leftsum+dp[l][k]);
                    } else if(leftsum>rightsum){
                        dp[l][r]=Math.max(dp[l][r],rightsum+dp[k+1][r]);
                    } else{
                        dp[l][r]=Math.max(dp[l][r],leftsum+Math.max(dp[l][k],dp[k+1][r]));
                    }
                }
            }
        }
        return dp[0][n-1];
    }
}