class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
	    HashSet<Character> h = new HashSet<>(); 
        for(char letter : allowed.toCharArray())
	    {
		    h.add(letter);
	    }
	    for(String x : words)
	    {
		    for(int i = 0; i < x.length(); i++)
		    {
			    if(!h.contains(x.charAt(i)))
			    {
				    break;
			    }
			    if(i == x.length()-1)
			    {
				    ans++;
			    }
		    }
	    }
	    return ans;
    }
}