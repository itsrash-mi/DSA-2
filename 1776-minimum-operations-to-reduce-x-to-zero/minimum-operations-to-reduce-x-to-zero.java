class Solution {
    public int minOperations(int[] nums, int x) {
        int ans=0;
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
        }
        int target=total-x;
        if(target<0) 
        {
            return -1;
        }
        if(target==0) 
        {
            return nums.length;
        }
        int i=0;
        int longest=0;
        int sum=0;
        for(int j=0;j<nums.length;j++)
        {
            sum+=nums[j];
            while(sum>target)
            {
                sum-=nums[i++];
            }
            if(sum==target)
            {
                longest=Math.max(longest,j-i+1);
            }
        }
        if(longest==0)
        {
            ans=-1;
        }
        else
        {
            ans=nums.length-longest;
        }
        return ans;
    }
}