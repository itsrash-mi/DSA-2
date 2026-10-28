class Solution {
    public int countOdds(int low, int high) {
        int temp=high-low+1;
        int ans=0;
        if(low%2!=0 && high%2!=0)
        {
            ans=(temp/2)+1;
        }
        else
        {
            ans=temp/2;
        }
        return ans;
    }
}