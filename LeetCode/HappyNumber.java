class Solution {

    private static long generateNumber(long n) {
        long sum = 0;
        while(n!=0) {
            sum += (n%10)*(n%10);
            n = n/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> numbers = new HashSet<>();
        long slow = n;
        long fast = n;
        
        do {
            slow = generateNumber(slow);
            fast = generateNumber(generateNumber(fast));
            if(slow == 1 || fast == 1)
                return true;
        } while(slow != fast);

        return false;
    }
}