class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqCount = new HashMap<>();
        for(int num: arr) {
            freqCount.put(num, freqCount.getOrDefault(num, 0)+1);
        }
        Set<Integer> frequencies = new HashSet<>();
        for(int value: freqCount.values()) {
            if(frequencies.contains(value)) return false;
            frequencies.add(value);
        }
        return true;
    }
}