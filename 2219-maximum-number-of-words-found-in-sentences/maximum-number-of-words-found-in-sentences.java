class Solution {
    public int mostWordsFound(String[] sentences) 
    {
        int ans=0;
        for(String x:sentences)
        {
            ans=Math.max(ans, x.split(" ").length);
        }
        return ans; 
    }
}