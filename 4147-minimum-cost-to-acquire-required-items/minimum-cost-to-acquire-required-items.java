class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        int mi = Math.min(need1, need2);
        int mx = Math.max(need1, need2);
        long a = (long) need1 * cost1 + (long) need2 * cost2;
        long b = (long) mi * costBoth + (long) (need1 - mi) * cost1 + (long) (need2 - mi) * cost2;
        long c = (long) mx * costBoth;
        return Math.min(a, (Math.min(b, c)));
    }
}