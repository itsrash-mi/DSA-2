class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=0;
        for(int[] x:accounts)
        {
            int sum=0;
            for(int i:x)
            {
                sum+=i;
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}