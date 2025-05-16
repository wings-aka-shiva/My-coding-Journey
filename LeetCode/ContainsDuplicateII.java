class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> duplicates = new HashMap<>();
        for(int i=0; i< nums.length; ++i) {
            if(duplicates.containsKey(nums[i])) {
                if(i-duplicates.get(nums[i])<=k)
                    return true;
            }
            duplicates.put(nums[i], i);
        }
        return false;
    }
}