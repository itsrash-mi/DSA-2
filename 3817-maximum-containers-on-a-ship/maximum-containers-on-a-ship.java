class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int ans=0;
        int weight=n*n*w;
        if(weight < maxWeight)
        {
            ans=n*n;
        }
        else
        {
            ans=maxWeight/w;
        }
        return ans;
    }
}