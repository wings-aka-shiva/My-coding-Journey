class Solution {
    public int romanToInt(String s) {
        int num=0;
        HashMap <Character,Integer> romanValue = new HashMap<>();
        romanValue.put('I',1);
        romanValue.put('V',5);
        romanValue.put('X',10);
        romanValue.put('L',50);
        romanValue.put('C',100);
        romanValue.put('D',500);
        romanValue.put('M',1000);
        int preValue=1000;
        int currentValue=0;
        int result=0;
        for( int i=0; i<s.length(); ++i){
            currentValue = romanValue.get(s.charAt(i));
            if(preValue<currentValue)
                result+=currentValue-(preValue*2);
            else
                result+=currentValue;
            preValue=currentValue;
        }
        return result;
    }
}
