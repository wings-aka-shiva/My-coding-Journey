class RecentCounter {

    Queue<Integer> counter;

    public RecentCounter() {
        counter = new LinkedList<>();
    }
    
    public int ping(int t) {
        counter.offer(t);
        while(counter.peek() < t-3000) {
            counter.poll();
        }

        return counter.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */