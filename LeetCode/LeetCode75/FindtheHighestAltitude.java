class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int highestAltitude = currentAltitude;
        for(int alt : gain) {
            currentAltitude += alt;
            highestAltitude = Math.max(highestAltitude, currentAltitude);
        }
        return highestAltitude;
    }
}