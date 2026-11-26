class Solution {
    public boolean canAliceWin(int n) {
       
        int numberOfRemovingStones = 10;
        int count = 0;
        while (n >= numberOfRemovingStones && numberOfRemovingStones > 0) {
            n = n - numberOfRemovingStones;
            numberOfRemovingStones--;
            count++;
        }
        if (count % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}