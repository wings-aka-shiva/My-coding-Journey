class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> findNumber = new HashMap<>();
            for(int i=0;i<nums.length;++i){
                int checkNumber = target - nums[i];
                if(findNumber.containsKey(checkNumber))
                    return new int[] { findNumber.get(checkNumber),i };
                findNumber.put(nums[i],i);
            }
        return new int[] {};
    }
}
