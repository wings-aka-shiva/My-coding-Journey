class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if((str1+str2).equals(str2+str1) != true) return "";
        int lengthOfStr1 = str1.length();
        int lengthOfStr2 = str2.length();
        while(lengthOfStr1 != lengthOfStr2) {
            if(lengthOfStr1 < lengthOfStr2) {
                lengthOfStr2 -= lengthOfStr1;
            }
            else {
                lengthOfStr1 -= lengthOfStr2;
            }
        }
        return str2.substring(0, lengthOfStr1);

    }
}