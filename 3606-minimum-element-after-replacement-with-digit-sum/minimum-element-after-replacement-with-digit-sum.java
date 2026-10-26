class Solution {
    public int minElement(int[] nums) {
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];
            int sum=0;
            while(temp>0)
            {
                sum=sum+(temp%10);
                a[i]=sum;
                temp=temp/10;
            }
        }
        int min=a[0];
        for(int x:a)
        {
            min=Math.min(min,x);
        }
        return min;
    }
}