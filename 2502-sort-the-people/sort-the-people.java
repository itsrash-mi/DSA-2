class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        HashMap<Integer, String> h = new HashMap<>();
        for (int i = 0; i < n; i++) 
        {
            h.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] res = new String[n];
        for (int i = 0; i < n; i++) 
        {
            res[i] = h.get(heights[n - 1 - i]);
        }
        return res;
    }
}