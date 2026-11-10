class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h=new HashSet<>();
        int i=0; int j=0; int ans=0;
        while(j<s.length())
        {
            if(!h.contains(s.charAt(j)))
            {
                h.add(s.charAt(j++));
                ans=Math.max(ans,h.size());
            }
            else
            {
                h.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}