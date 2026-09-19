class Solution {
    public boolean isIsomorphic(String s, String t) {
        boolean ans=true;
        HashMap<Character, Character> h = new HashMap<>();
        HashMap<Character, Character> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) 
        {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (h.containsKey(a) && h.get(a) != b)
            {    return false;  }
            if (m.containsKey(b) && m.get(b) != a)
            {    return false;  }
            h.put(a, b);
            m.put(b, a);
        }
        return ans;
    }
}