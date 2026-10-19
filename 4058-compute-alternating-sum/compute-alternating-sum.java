class Solution {
    public int alternatingSum(int[] nums) {
        int n=nums.length;
        int e=0;
        int o=0;
        for(int x=0;x<n;x++)
        {
            if(x%2==0)
            {
                e+=nums[x];
            }
            else
            {
                o+=nums[x];
            }
        }
        int res=e-o;
        return res;
    }
}