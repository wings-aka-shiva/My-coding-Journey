class Solution {
    public int possibleStringCount(String word) {
        if(word.length() == 0) return 0;
        if(word.length() == 1) return 1;
        if(word.length() == 2)    
            if(word.charAt(0)==word.charAt(1)) return 2;
            else return 1;

        char previousLetter = word.charAt(0); 
        int count=0;
        for(int i=1; i<word.length(); ++i) {
            if(previousLetter==word.charAt(i))
                count++;
            previousLetter = word.charAt(i);
        }

        return count+1;
    }
}