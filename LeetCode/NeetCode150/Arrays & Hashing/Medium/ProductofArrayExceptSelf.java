class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length, product = 1;
        int[] leftProduct = new int[numsLength];
        leftProduct[0] = 1;
        for(int i = 1; i < numsLength; ++i) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }
        int[] rightProduct = new int[numsLength];
        rightProduct[numsLength - 1] = 1;
        for(int i = numsLength - 2; i > -1; --i) {
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
        }
        int[] productES = new int[numsLength];
        productES[0] = rightProduct[0];
        productES[numsLength - 1] = leftProduct[numsLength - 1];
        for(int i = 1; i < numsLength - 1; ++i) {
            productES[i] = leftProduct[i] * rightProduct[i];
        }
        return productES;
    }
}