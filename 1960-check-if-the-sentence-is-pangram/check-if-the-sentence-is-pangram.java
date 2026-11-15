class Solution {
    public boolean checkIfPangram(String sentence) {
        String s = sentence.toLowerCase();
        boolean ans[] = new boolean[26];
        for(int i=0; i<sentence.length(); i++)
        {
            char c = sentence.charAt(i);
            if(c>='a' && c<='z')
            {
                int j = c - 'a';
                ans[j] = true;
            }
        }
        for(int i=0; i<ans.length; i++)
        {
            if(ans[i]==false)
            {
                return false;
            }
        }
        return true;
    }
}