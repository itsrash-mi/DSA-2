class Solution {
    public boolean detectCapitalUse(String word) {
        boolean ans=false;
        int count=0;
        int n=word.length();
        for(char x: word.toCharArray())
        {
            if(Character.isUpperCase(x))
            {
                count++;
            }
        }
        if(count==0 || count==n || (count==1 && Character.isUpperCase(word.charAt(0))))
        {
            ans=true;
        }
        return ans;
    }
}