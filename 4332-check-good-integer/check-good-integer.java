class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int dif=0;
        while(n!=0)
        {
            int mod=n%10;
            sum+=mod;
            dif+=(mod*mod);
            n=n/10;
        }
        System.out.print(dif);
        int m=dif-sum;
        return m>=50;
    }
}