class Solution {
    public void moveZeroes(int[] nums) {
        int numsLength = nums.length;
        if(numsLength<2) {
            return;
        }

        int ze = 0, nze = 0;
        while(nze<numsLength) {
            if(nums[nze]!=0){
                int temp = nums[nze];
                nums[nze] = nums[ze];
                nums[ze] = temp;
                ze++;
            }
            nze++;
        }
        return;
    }
}