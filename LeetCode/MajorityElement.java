class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> majorityPairs = new HashMap<>();
        for(int i=0; i< nums.length; ++i) {
            majorityPairs.put(nums[i], majorityPairs.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : majorityPairs.entrySet()) {
            if(entry.getValue() > nums.length/2)
                return entry.getKey();
        }
        return -1;
    }
}