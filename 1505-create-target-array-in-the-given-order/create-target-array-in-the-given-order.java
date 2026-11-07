class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int dp[]=new int[n];
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            l.add(index[i],nums[i]);
        }
        for(int i=0;i<n;i++)
        {
            dp[i]=l.get(i);
        }
        return dp;
    }
}