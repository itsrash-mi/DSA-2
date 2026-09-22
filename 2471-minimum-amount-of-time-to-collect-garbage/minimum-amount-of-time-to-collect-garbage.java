class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int m=0;
        int p=0;
        int g=0;
        int sum=0;
        int n=garbage.length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            sum+=garbage[i].length();
            for(char c: garbage[i].toCharArray())
            {
                if(c=='M')
                    m=i;
                else if(c=='P')
                    p=i;
                else if(c=='G')
                    g=i;
            }
        }
        for(int j=1;j<n;j++)
        {
            dp[j]=dp[j-1]+travel[j-1];
        }
        sum+=dp[m]+dp[p]+dp[g];
        return sum;
    }
}