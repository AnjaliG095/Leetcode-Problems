class Solution {
    public int maxLength(int[] nums) {
        
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            long prod = 1;
            long g = nums[i];
            long l = 1;

            for (int j = i; j < nums.length; j++) {

                prod = prod * nums[j];

                g = gcd(g, nums[j]);

                l = (l * nums[j]) / gcd(l, nums[j]);

                if (prod == l * g) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }

                if (prod > l * g) {
                    break;
                }
            }
        }

        return maxLen;
    }

    public long gcd(long a, long b) {

        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}