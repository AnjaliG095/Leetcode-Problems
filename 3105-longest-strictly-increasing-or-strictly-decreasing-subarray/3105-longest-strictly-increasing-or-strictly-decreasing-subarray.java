class Solution {
    public int longestMonotonicSubarray(int[] nums) {
         int  inclength=1;
             int declength=1;
            int maxlength=1;
        for(int i = 1;i<nums.length;i++){
           
            if(nums[i]>nums[i-1]){
                inclength++;
                declength=1;
            }
            else if(nums[i]<nums[i-1]){
                declength++;
            inclength=1;

            }
            else{
               inclength=1;
              declength=1;

            }
            maxlength= Math.max(maxlength,Math.max(inclength,declength));
        }
        return maxlength;
    }
}