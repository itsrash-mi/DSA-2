class Solution {
    public String trafficSignal(int timer) {
        String ans="Invalid";
        if(timer>30 && timer <=90)
        {
            ans="Red";
        }
        else if(timer==30)
        {
            ans="Orange";
        }
        else if(timer==0)
        {
            ans="Green";
        }
        return ans;
    }
}