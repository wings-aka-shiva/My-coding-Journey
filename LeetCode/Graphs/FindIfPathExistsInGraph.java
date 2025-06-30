class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] vertices = new boolean[n];
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>(n);
        Queue<Integer> edgesQueue = new ArrayDeque<>();

        for(int i=0; i<n; ++i)
            adjacencyList.add(new ArrayList<Integer>());

        for(int i=0; i<edges.length; ++i) {
            adjacencyList.get(edges[i][0]).add(edges[i][1]);
            adjacencyList.get(edges[i][1]).add(edges[i][0]);
        }

        edgesQueue.offer(source);

        while(!edgesQueue.isEmpty()) {
            int polledVertex = edgesQueue.poll();
            if(polledVertex == destination) return true;
            if(!vertices[polledVertex]) {
                vertices[polledVertex] = true;
                for(int vertex: adjacencyList.get(polledVertex)) {
                    if(!vertices[vertex]) {
                        edgesQueue.offer(vertex);
                    }
                }
            }
        }

        return false;
    }
}