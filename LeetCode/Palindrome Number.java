class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int quo=x;
        int reverse=0;
        while(quo!=0){ 
            int mod= quo%10;
            quo =quo/10;
            reverse=(10*reverse)+mod; 
        }
        return x==reverse;
    }
}
