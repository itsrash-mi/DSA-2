class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        for (int x : nums1) 
        {
            h1.add(x);
        }
        for (int x : nums2) 
        {
            h2.add(x);
        }
        int c1 = 0;
        for (int x : nums1) 
        {
            if (h2.contains(x)) 
            {
                c1++;
            }
        }
        int c2 = 0;
        for (int x : nums2) 
        {
            if (h1.contains(x)) 
            {
                c2++;
            }
        }
        return new int[]{c1, c2};
    }
}