class Solution {
    public boolean checkPerfectNumber(int num) {
        int i,sum=1;
        if(num<=1)
            return false;
        for(i=2;i*i<num;i++){
            if(num%i==0){
                sum=sum+i;
                if(i!=num/i)
                    sum+=num/i;
            }
        }
        return sum==num;
    }
}