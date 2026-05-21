class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> groupKeys = new HashMap<>();
        for(String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            groupKeys.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(groupKeys.values());
    }
}