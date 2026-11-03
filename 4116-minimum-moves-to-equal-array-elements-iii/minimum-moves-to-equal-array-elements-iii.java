class Solution {
    public int minMoves(int[] nums) {
        int max=1;
        for(int x:nums)
        {
            max=Math.max(max,x);
        }
        int res=0;
        for(int x:nums)
        {
            res+=(max-x);
        }
        return res;
    }
}