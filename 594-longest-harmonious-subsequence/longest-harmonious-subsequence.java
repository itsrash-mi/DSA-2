class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int x : nums) 
        {
            h.put(x, h.getOrDefault(x, 0) + 1);
        }
        int ans = 0;
        for (int x : h.keySet()) 
        {
            if (h.containsKey(x + 1)) 
            {
                ans = Math.max(ans, h.get(x) + h.get(x + 1));
            }
        }
        return ans;
    }
}