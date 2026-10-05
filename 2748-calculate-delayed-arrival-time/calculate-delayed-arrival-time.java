class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum =arrivalTime+delayedTime;
        int ans=0;
        if(sum>=24)
        {
            ans=sum%24;
        }
        else
        {
            ans=sum;
        }
        return ans;
    }
}