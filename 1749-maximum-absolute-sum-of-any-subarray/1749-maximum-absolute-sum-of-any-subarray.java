class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max_sum = 0;
        int min_sum = 0;
        int curr_max = 0;
        int curr_min = 0;

        for (int num : nums) {
           //bo ya uske previous bala dono me se max curr me ayega 
            curr_max = Math.max(num, curr_max + num);
            max_sum = Math.max(max_sum, curr_max);

            curr_min = Math.min(num, curr_min + num);
            min_sum = Math.min(min_sum, curr_min);
        }

       
        return Math.max(max_sum, Math.abs(min_sum));
    }
}
