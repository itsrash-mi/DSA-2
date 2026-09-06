class Solution {
    public int findMiddleIndex(int[] nums) {
        for(int i=0;i<=nums.length-1;i++)
        {
            int s1=0; int s2=0;
            for(int j=0;j<=i-1;j++)
            {
                s1=s1+nums[j];
            }
            for(int k=i+1;k<=nums.length-1;k++)
            {
                s2=s2+nums[k];
            }
            if(s1==s2)
            {
                return i;
            }
        }
        return -1;
    }
}