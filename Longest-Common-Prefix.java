class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        
        String eersteWoord = strs[0];
        String LaatsteWoord = strs[strs.length - 1];
        int lengthPrefix = Math.min(eersteWoord.length(), LaatsteWoord.length());
        
        int counter = 0;
        while (counter < lengthPrefix && 
               eersteWoord.charAt(counter) == LaatsteWoord.charAt(counter)) {
            counter++;
        }
        
        return eersteWoord.substring(0, counter);
    }
}