class Solution {
    public int countEven(int num) {
        int res;
        int sum = 0;
        int n = num;
        while (n != 0) 
        {
            sum += n % 10;
            n /= 10;
        }
        res=(sum & 1) == 1 ? (num - 1) / 2 : num / 2;
        return res;
    }
}