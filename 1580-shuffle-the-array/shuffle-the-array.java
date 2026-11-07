class Solution {
    public int[] shuffle(int[] nums, int n) {
        int dp[]=new int[2*n];
        for(int i=0;i<n;i++)
        {
            int j=2*i;
            dp[j]=nums[i];
            dp[j+1]=nums[n+i];
        }
        return dp;
    }
}