class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] relativeRanks = new String[score.length];

        PriorityQueue<int[]> queueRankings = new PriorityQueue<>( (a, b) -> b[0] - a[0]);

        for( int i=0; i<score.length; ++i) {
            queueRankings.offer(new int[]{score[i], i});
        }

        int rank = 0;
        while(!queueRankings.isEmpty()) {
            int[] queuedRank = queueRankings.poll();
            rank++;
            switch(rank) {
                case 1: relativeRanks[queuedRank[1]] = "Gold Medal"; break;
                case 2: relativeRanks[queuedRank[1]] = "Silver Medal"; break;
                case 3: relativeRanks[queuedRank[1]] = "Bronze Medal"; break;
                default: relativeRanks[queuedRank[1]] = String.valueOf(rank);
            }
        }

        return relativeRanks;
    }
}