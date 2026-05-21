class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsIndices = new HashMap<>();
        for(int i=0; i<nums.length; ++i) {
            if(numsIndices.containsKey(target-nums[i])) {
                return new int[] {numsIndices.get(target-nums[i]), i};
            }
            else {
                numsIndices.put(nums[i], i);
            }
        }
        return new int[] {};
        // for( int i = 0; i<nums.length ; ++i) {
        //     for ( int j=i+1; j<nums.length; ++j){
        //         if( target - nums[i] == nums[j])
        //             return new int[] {i, j};
        //     }
        // }
        // return new int[0];
    }
}