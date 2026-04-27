class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 1)
            return false;

        HashSet<Integer> numbers = new HashSet<>();
        for(int num: nums) {
            if(numbers.contains(num))
                return true;
            numbers.add(num);
        }
        return false;

        // Arrays.sort(nums);
        // for(int i=1; i<nums.length; i++) {
        //     if(nums[i-1]==nums[i])
        //         return true;
        // }
        // return false;

        // HashMap<Integer, Integer> numbers = new HashMap<>();
        // for(int num : nums) {
        //     numbers.put(num, numbers.getOrDefault(num, 0)+ 1);
        //     if(numbers.get(num)==2)
        //         return true;
        // }
        // return false;
    }
}