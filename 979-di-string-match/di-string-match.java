class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int ans[]=new int[n+1];
        int i=0;
        int j=n;
        for(int x=0;x<n;x++)
        {
            if(s.charAt(x) == 'I')
            {
                ans[x]=i;
                i++;
            }
            else
            {
                ans[x]=j;
                j--;
            }
        }
        ans[n]=j;
        return ans;
    }
}