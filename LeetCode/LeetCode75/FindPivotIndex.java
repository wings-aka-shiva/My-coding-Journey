class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumNums = new int[nums.length];
        int totalSum = 0, preSum = 0;

        for(int i=0; i< nums.length; ++i) {
            totalSum += nums[i];
        }

        for(int i=0; i< nums.length; ++i) {
            if(preSum == totalSum-preSum-nums[i]) return i;
            preSum += nums[i];
        }
        return -1;
    }
}