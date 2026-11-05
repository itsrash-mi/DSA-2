class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int k=0;
        if(n % 2!=0)
        {
            k=nums[n/2];
        }
        else
        {
            k=nums[n/2];
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
           count+=Math.abs(nums[i]-k);
        }
        return count;
    }
}