class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int mod=0;
        int n=x;
        while(x!=0)
        {
            mod+=x%10;
            x/=10;
        }
        if(n%mod==0)
        {
            return mod;
        }
        return -1;
    }
}