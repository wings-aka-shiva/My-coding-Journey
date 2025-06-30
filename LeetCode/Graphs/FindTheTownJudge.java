class Solution {
    public int findJudge(int n, int[][] trust) {
        boolean[] townPeople = new boolean[n+1];
        int[] trustCount = new int[n+1];
        int count = 0;
        for(int i=0; i< trust.length; ++i) {
            townPeople[trust[i][0]] = true;
            trustCount[trust[i][1]]++;
        }
        for(int i=1; i<townPeople.length; ++i) {
            if(!townPeople[i] && trustCount[i]==n-1)
                return i;
        }
        return -1;
    }
}