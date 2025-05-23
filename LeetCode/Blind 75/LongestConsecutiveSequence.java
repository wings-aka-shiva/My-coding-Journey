class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;

        if(nums.length == 1)
            return 1;

        HashSet<Integer> numbers = new HashSet<>();

        for( int num: nums) {
            numbers.add(num);
        }
        int longestSubSequence = 0;
        for( int num: numbers) {
            int count = 0;
            if(!numbers.contains(num-1)) {
                do {
                    count++;
                    num++;
                } while(numbers.contains(num));
            longestSubSequence = Math.max(longestSubSequence, count);
            }
        }

        return longestSubSequence;
    }
}