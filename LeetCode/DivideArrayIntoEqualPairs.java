class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int i = 0; i< nums.length; ++i) {
            if(map.containsKey(nums[i])) {
                map.remove(nums[i]);
            } else {
                map.put(nums[i], 1);
            }
        }
        if(map.size() == 0)
            return true;
        return false;
    }
}