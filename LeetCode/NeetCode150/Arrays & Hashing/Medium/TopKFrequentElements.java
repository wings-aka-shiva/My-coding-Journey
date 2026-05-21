class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyElements = new HashMap<>();
        int[] result = new int[k];
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            frequencyElements.put(nums[i], frequencyElements.getOrDefault(nums[i], 0) + 1);
        }
        ArrayList<Integer>[] bucketSort = new ArrayList[n+1]; 
        frequencyElements.forEach((key, value) -> {
            if(bucketSort[value] == null) {
                bucketSort[value] = new ArrayList();
            }
            bucketSort[value].add(key);
        });
        int resultIndex = 0;
        for(int i = n; i>0; i--) {
            ArrayList temp = bucketSort[i];
            if(temp != null && temp.size()>0) {
                for(int j = 0; j < temp.size(); ++j) {
                    result[resultIndex++] = (int)temp.get(j);
                    if(--k == 0) return result;
                }
            }
        }
        return result;
    }
}