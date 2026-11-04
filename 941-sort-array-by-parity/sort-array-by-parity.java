class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a[]=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        for(int x:nums)
        {
            if(x%2==0)
            {
                a[i]=x;
                i++;
            }
            else{
                a[j]=x;
                j--;
            }
        }
        return a;
    }
}