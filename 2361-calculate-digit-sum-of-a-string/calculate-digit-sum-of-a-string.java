class Solution {
    public String digitSum(String s, int k) {
        int n = s.length();
        char[] a = s.toCharArray();
        char[] b = new char[n];
        while (n > k) {
            int m = 0;
            for (int i = 0; i < n; i += k) {
                int sum = 0;
                int end = Math.min(i + k, n);
                for (int j = i; j < end; j++)
                    sum += a[j] - '0';
                if (sum >= 10) {
                    int start = m;
                    do {
                        b[m++] = (char) ('0' + sum % 10);
                        sum /= 10;
                    } while (sum > 0);
                    for (int l = start, r = m - 1; l < r; l++, r--) {
                        char temp = b[l];
                        b[l] = b[r];
                        b[r] = temp;
                    }
                } else {
                    b[m++] = (char) ('0' + sum);
                }
            }
            char[] temp = a;
            a = b;
            b = temp;
            n = m;
        }
        return new String(a, 0, n);
    }
}