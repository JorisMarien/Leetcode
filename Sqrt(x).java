class Solution {
    public int mySqrt(int x) {
        Long number =(long) 1;
        Long longx = (long) x;
        while (number * number <= longx) {
            number++;
        }
        return Math.toIntExact(number) - 1;
    }
}