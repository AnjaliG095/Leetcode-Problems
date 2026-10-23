class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length ;
        int[] answer = new int[nums.length];
        int leftpdt= 1;
        for (int i = 0; i < n; i++) {
            answer[i] = leftpdt;
          leftpdt *= nums[i];

        }
        int rightpdt = 1 ;
        for(int i = n-1;i>=0;i--){
            answer[i] *= rightpdt ;
            rightpdt *=nums[i];
        }
        return answer ;
    }
}