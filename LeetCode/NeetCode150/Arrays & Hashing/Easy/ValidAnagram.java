class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] counter = new int[256];
        for(int i=0; i<s.length(); ++i){
            counter[s.charAt(i)]++;
            counter[t.charAt(i)]--;
        }
        for(int val: counter)
            if(val!=0)
                return false;
        return true;
    }
}