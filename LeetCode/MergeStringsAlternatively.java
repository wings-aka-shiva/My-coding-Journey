class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder newWord = new StringBuilder();
        int word1Length = word1.length(), word2Length = word2.length();
        int i = 0;
        while( i < word1Length && i < word2Length) {
            newWord.append(word1.charAt(i));
            newWord.append(word2.charAt(i));
            ++i;
        }    

        if( i < word1Length ) {
            newWord.append(word1.substring(i));
        }    

        if( i < word2Length ) {
            newWord.append(word2.substring(i));
        }   

        return newWord.toString();
    }
}