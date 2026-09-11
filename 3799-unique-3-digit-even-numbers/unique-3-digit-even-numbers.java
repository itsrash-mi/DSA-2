class Solution {
    public int totalNumbers(int[] digits) {
        int count[]=new int[10];
        for(int x:digits)
        {   count[x]++;   }
        int ans=0;
        for(int i=1;i<=9;i++)
        {
            for(int j=0;j<=9;j++)
            {
                for(int k=0;k<=9;k=k+2)
                {
                    if(count[i]==0 || count[j]==0 || count[k]==0)
                    {    continue;   }
                    else if(i==j && j==k && count[i]<3)
                    {   continue;   }
                    else if(i==j && count[i]<2)
                    {   continue;   }
                    else if(i==k && count[i]<2)
                    {   continue;   }
                    else if(j==k && count[j]<2)
                    {   continue;   }
                    ans++;
                }
            }
        }
        return ans;
    }
}