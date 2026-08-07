class Solution {
    public int mySqrt(int x) {

        // Base cases
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Use long to avoid integer overflow
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }

            // Mid is too small
            if (square < x) {
                ans = mid;          // Store possible answer
                left = mid + 1;
            }
            // Mid is too large
            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}