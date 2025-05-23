class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> differenceArray = new ArrayList<>();

        Set<Integer> numsSet1 = new HashSet<>();
        Set<Integer> numsSet2 = new HashSet<>();

        for(int num: nums1){
            numsSet1.add(num);
        }
        for(int num: nums2){
            numsSet2.add(num);
        }

        Set<Integer> numsSet1_ = new HashSet<>(numsSet1);
        Set<Integer> numsSet2_ = new HashSet<>(numsSet2);

        numsSet1_.removeAll(numsSet2);
        numsSet2_.removeAll(numsSet1);

        differenceArray.add(new ArrayList<>(numsSet1_));
        differenceArray.add(new ArrayList<>(numsSet2_));

        return differenceArray;
    }
}