class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n=nums.length;
        int a=2;
        for(int i=0;i<n;i++)
        {
            int l=nums[i];
            for(int j=i+1;j<n;j++)
            {
                int r=nums[j];
                int temp=l-r;
                int b=2;
                for(int k=j+1;k<n;k++)
                {
                    int c=r-nums[k];
                    if(c==temp)
                    {
                        r=nums[k];
                        b++;
                    }
                }
                if(b>a)
                {
                    a=b;
                }
            }
        }
        return a;
    }
}