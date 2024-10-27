class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int origin = x;
        int reversed = 0;
        int devide = 0;
        for (int i = 0; x != 0 ; i++) {
            devide = x % 10;
            reversed = reversed * 10 + devide;
            x = x / 10;
        }
        if (reversed == origin){
            return true;
        }
        return false;
    }
}
