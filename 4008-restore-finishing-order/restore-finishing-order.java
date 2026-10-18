class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> h=new HashSet<>();
        int n=friends.length;
        int res[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            h.add(friends[i]);
        }
        for(int i=0;i<order.length;i++)
        {
            if(h.contains(order[i]))
            {
                res[count++]=order[i];
            }
        }
        return res;
    }
}