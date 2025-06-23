class Solution {
    public int arrayPairSum(int[] nums) {
        int maximizedSum = 0;

        Arrays.sort(nums);

        for(int i=0; i<nums.length; ++i) {
            if(i%2==0)
                maximizedSum += nums[i];
        }

        return maximizedSum;
    }
}