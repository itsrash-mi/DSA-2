class Solution {
    public boolean areOccurrencesEqual(String s) {
        boolean ans=true;
        HashMap<Character, Integer> h=new HashMap<>();
        char b[]=s.toCharArray();
        for(char ch:b)
        {
            h.put(ch, h.getOrDefault(ch,0)+1);
        }
        int count=h.get(s.charAt(0));
        for(char ch:h.keySet())
        {
            if(h.get(ch)!=count)
            {
                ans=false;
            }
        }
        return ans;
    }
}