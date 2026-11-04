class Solution {
    public boolean isPalindrome(String s) {
        // 1. Clean the string first (removes non-alpha characters and converts to lowercase)
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // 2. Initialize pointers based on the NEW string length
        int left = 0;
        int right = s.length() - 1;
        
        // 3. Compare characters moving inward
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Found a mismatch
            }
            left++;
            right--;
        }
        
        return true; 
    }
}
