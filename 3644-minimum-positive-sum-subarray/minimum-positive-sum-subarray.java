class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int a = Integer.MAX_VALUE;
        int[] p = new int[n + 1];
        for (int i = 0; i < n; i++)
            p[i + 1] = p[i] + nums.get(i);
        for (int i = 0; i < n; i++) 
        {
            for (int j = l; j <= r && i + j <= n; j++) 
            {
                int s = p[i + j] - p[i];
                if (s > 0 && s < a)
                    a = s;
            }
        }
        return a == Integer.MAX_VALUE ? -1 : a;
    }
}