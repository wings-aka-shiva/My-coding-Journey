class Solution {
    public int longestOnes(int[] nums, int k) {
        int countZeros = 0;
        int maxWindow = k, window = k;
        for(int i=0; i<k; ++i){
            if(nums[i]==0)
                countZeros++;
        }
        for(int i=k; i<nums.length; ++i) {
            if(nums[i]==1){
                window++;
            }
            else{
                if(countZeros<k){
                    window++;
                    countZeros++;
                }
                else {
                    while(nums[i-window]!=0){
                        window--;
                    }
                }
            }
            maxWindow = Math.max(maxWindow, window);
        }
        return maxWindow;
    }
}