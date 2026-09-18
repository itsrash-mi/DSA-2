class Solution {
    public int[] leftRightDifference(int[] nums) {
        int i=0;
        int j=0;
        for(int x:nums)
        {
            i+=x;
        }
        int ans[]=new int[nums.length];
        for(int x=0;x<nums.length;x++)
        {
            i-=nums[x];
            ans[x]=Math.abs(i-j);
            j+=nums[x];
        }
        return ans;
    }
}