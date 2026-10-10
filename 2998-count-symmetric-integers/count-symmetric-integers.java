class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for (int num = low; num <= high; num++) 
        {
            String s = Integer.toString(num);
            int len = s.length();
            if (len % 2 != 0)
            {
                continue;
            } 
            int mid = len / 2;
            int l=0,r=0;
            for (int i = 0; i < mid; i++)
            {
                l+=s.charAt(i)-'0';
                r+=s.charAt(i+mid)-'0';
            }
            if(l==r)
            {
                count++;
            }
        }
        return count;
    }
}