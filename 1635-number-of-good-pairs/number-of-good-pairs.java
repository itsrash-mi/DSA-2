class Solution {
    public int numIdenticalPairs(int[] nums) {
       HashMap<Integer, Integer> h = new HashMap<>();
        int ans = 0;
        for(int x:nums)
        {
            int count = h.getOrDefault(x,0);
            ans+=count;
            h.put(x,count+1);
        }
        return ans;
    }
}