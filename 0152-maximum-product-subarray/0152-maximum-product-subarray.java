class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxPro = Integer.MIN_VALUE;
        int pro = 1;
        for (int i = 0; i < n; i++) {
            pro *= nums[i];
            maxPro = Math.max(pro, maxPro);
            if (pro == 0) {
                pro = 1;
            }
        }
        pro = 1;
        for (int i = n - 1; i >= 0; i--) {
            pro *= nums[i];
            maxPro = Math.max(pro, maxPro);
            if (pro == 0) {
                pro = 1;

            }
           
        }
         return maxPro;
    }
}
