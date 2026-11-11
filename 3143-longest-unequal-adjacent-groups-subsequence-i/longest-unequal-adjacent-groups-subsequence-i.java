class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();
        int j=groups[0];
        ans.add(words[0]);
        for(int i=1; i<words.length; i++) 
        {
            if(groups[i] != j) 
            {
                j = groups[i];
                ans.add(words[i]);
            }
        }
        return ans;
    }
}