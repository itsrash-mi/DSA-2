class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int temp=0;
        for(char c:s.toCharArray())
        {
            if(c==')')
            {
                temp--;
                continue;
            }
            if(c!='(')
            {
                continue;
            }
            temp++;
            if(temp>ans)
            {
                ans=temp;
            }
        }
        return ans;
    }
}