class Solution {
    public int findCenter(int[][] edges) {
        Set<Integer> nodes = new HashSet<>();

        for(int[] i:edges) {
            if(nodes.contains(i[0]))
                return i[0];
            else
            if(nodes.contains(i[1]))
                return i[1];
            else {
                nodes.add(i[0]);
                nodes.add(i[1]);
            }
        }

        return -1;
    }
}