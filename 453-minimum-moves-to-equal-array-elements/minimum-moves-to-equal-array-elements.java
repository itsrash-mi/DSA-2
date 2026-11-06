class Solution {
    public int minMoves(int[] nums) {
        int ans=0;
        int s=nums[0];
        for(int x:nums)
        {
            s=Math.min(x,s);
        }
        for(int x:nums)
        {
            ans+=(x-s);
        }
        return ans;
    }
}