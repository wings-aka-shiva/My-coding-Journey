class Solution {
    public boolean isValid(String s) {
        if(s.length()<2){
            return false;
        }
        char[] charArray = new char[s.length()];
        int index = 0;
        int newIndex = 0;
        for(int i=0; i<s.length(); ++i) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                charArray[index] = s.charAt(i);
                ++index;
            }
            else {
                if(index<1){
                    return false;
                }
                switch(s.charAt(i)) {
                    case ')': newIndex = validParenthesesMatch('(', charArray, index);break;
                    case '}': newIndex = validParenthesesMatch('{', charArray, index);break;
                    case ']': newIndex = validParenthesesMatch('[', charArray, index);break;
                }
                if(newIndex<index){
                    index = newIndex;
                }
                else{
                    return false;
                }
            }
        }

        return (index == 0);
    }

    public int validParenthesesMatch(char openingBrace, char[] charArray, int charIndex) {
        if(charArray[charIndex-1]==openingBrace){
            charIndex--;
        }
        return charIndex;
    }
}