class Solution {
    public String removeStars(String s) {
        Stack<Character> nonStars = new Stack<>();
        for(int i = 0; i<s.length(); ++i) {
            if(s.charAt(i) == '*') {
                nonStars.pop();
            }
            else {
                nonStars.push(s.charAt(i));
            }
        }
        StringBuilder s_= new StringBuilder();
        while(nonStars.isEmpty() == false) {
            s_.append(nonStars.pop());
        }

        return s_.reverse().toString();
    }
}