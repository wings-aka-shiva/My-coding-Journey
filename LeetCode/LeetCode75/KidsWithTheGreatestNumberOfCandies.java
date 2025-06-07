class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleanCandies = new ArrayList<>();
        int maxValue = Arrays.stream(candies).max().getAsInt();
        for(int candy: candies) {
            booleanCandies.add(candy+extraCandies >= maxValue);
        }
        return booleanCandies;
    }
}