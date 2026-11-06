class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int i=0;
        int k=arr1.length;
        int c=0;
        int ans=0;
        while(i<k)
        {
            int j=0;
            int count=0;
            while(j<arr2.length)
            {
                c=Math.abs(arr1[i]-arr2[j]);
                if(c>d)
                {
                    count++;
                    if(count==arr2.length)
                    {
                        ans+=1;
                    }
                }
                j++;
            }
            i++;
        }
        return ans;
    }
}