class Solution {
    public int lengthOfLastWord(String s) {

        String[] array = s.split(" ");

        String lastword = array[array.length-1];

        return lastword.length();
    }
}