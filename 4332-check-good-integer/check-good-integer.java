class Solution {
    public boolean checkGoodInteger(int n) {
        int ds=0;
        int ss=0;
        while(n>0)
        {
            ds=ds+(n%10);
            ss=ss+((n%10)*(n%10));
            n=n/10;
        }
        if(ss-ds>=50)
        {
            return true;
        }
        return false;
    }
}