class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int vowelsCount = 0;
        int maxVowels = 0;

        for(int i=0; i<k && i<s.length(); ++i) {
            if(vowels.contains(s.charAt(i))){
                vowelsCount++;
            }
        }

        if(k >= s.length()) return vowelsCount;

        maxVowels = vowelsCount;

        for(int i=k; i<s.length(); ++i) {
            if(vowels.contains(s.charAt(i))) vowelsCount++;
            if(vowels.contains(s.charAt(i-k))) vowelsCount--;
            maxVowels = Math.max(maxVowels, vowelsCount);
        }

        return maxVowels;
    }
}