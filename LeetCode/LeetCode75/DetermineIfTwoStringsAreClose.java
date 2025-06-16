class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        Set<Character> word1Set = new HashSet<>();
        Set<Character> word2Set = new HashSet<>();

        for(int i=0; i<word1.length(); ++i) {
            word1Set.add(word1.charAt(i));
            word2Set.add(word2.charAt(i));
        }

        if(!word1Set.equals(word2Set)) return false;

        Map<Character, Integer> word1TreeMap = new TreeMap<>();
        Map<Character, Integer> word2TreeMap = new TreeMap<>();

        for(int i=0; i<word1.length(); ++i) {
            Character w1 = word1.charAt(i);
            Character w2 = word2.charAt(i);

            word1TreeMap.put(w1, word1TreeMap.getOrDefault(w1, 0)+1);
            word2TreeMap.put(w2, word2TreeMap.getOrDefault(w2, 0)+1);
        }

        List<Integer> word1MapValues = new ArrayList<>(word1TreeMap.values());
        List<Integer> word2MapValues = new ArrayList<>(word2TreeMap.values());

        Collections.sort(word1MapValues);
        Collections.sort(word2MapValues);

        return word1MapValues.equals(word2MapValues);
    }
}