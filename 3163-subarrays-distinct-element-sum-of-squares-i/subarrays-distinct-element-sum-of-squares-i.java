class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans=0;
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i;j<nums.size();j++)
            {
                h.add(nums.get(j));
                ans+=h.size()*h.size();
            }
            h.clear();
        }
        return ans;
    }
}