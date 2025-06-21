class Solution {
    public int longestPalindrome(String s) {
        int[] charCount = new int[128];

        for(char c: s.toCharArray()) {
            charCount[c]++;
        }

        int longestPalindromeLength = 0;
        boolean oddChar = false;

        for(int c: charCount) {
            longestPalindromeLength += (c/2)*2;
            if(c%2 == 1)
                oddChar = true;
        }

        if(oddChar) longestPalindromeLength++;

        return longestPalindromeLength;
    }
}