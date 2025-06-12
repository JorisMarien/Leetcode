class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int original = x;

        while (x != 0 && x > 0) {

            // get last digit from num
            int digit = x % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            x /= 10;
        }

        if (reversed == original) {
            return true;
        } else {
            return false;
        }
    }
}