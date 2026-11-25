class Solution {
    private int[] candidates;
    private int target;
    private List<List<Integer>> result;
    private List<Integer> combo;
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        this.candidates = candidates;
        this.target = target;
        result = new ArrayList<>();
        combo = new ArrayList<>();
        backtrack(0, 0);
        return result;
    }
    private void backtrack(int start, int total) 
    {
        if (total == target) 
        {
            result.add(new ArrayList<>(combo));
            return;
        }
        if (total > target) 
        {
            return;
        }
        for (int i = start; i < candidates.length; i++) 
        {
            combo.add(candidates[i]);
            backtrack(i, total + candidates[i]);
            combo.remove(combo.size() - 1);
        }
    }
}