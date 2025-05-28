class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length()) return false;
        if(s.length() == 0) return true;
        int i = 0, j = 0;
        while(j<t.length()) {
            if(i==s.length()) return true;
            if(s.charAt(i)!=t.charAt(j)) {
                ++j;
            }
            else {
                ++i;++j;
            }
        }
        if(i==s.length() && j==t.length()) return true;
        else return false;
    }
}