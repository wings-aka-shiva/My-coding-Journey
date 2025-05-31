class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> asteroidsDeque = new ArrayDeque<>();
        for(int asteroid: asteroids) {
                boolean destroyedAsteroid = false;
                while(asteroidsDeque.isEmpty() == false && (asteroidsDeque.peekLast() >-1 && asteroid < 0)) {
                    if(asteroidsDeque.peekLast() < -asteroid) {
                        asteroidsDeque.pollLast();
                    }
                    else if(asteroidsDeque.peekLast() == -asteroid){
                        asteroidsDeque.pollLast();
                        destroyedAsteroid = true;
                        break;
                    }
                    else {
                        destroyedAsteroid = true;
                        break;
                    }
                }

                if(destroyedAsteroid == false)
                    asteroidsDeque.offerLast(asteroid);
            }

        int[] remainingAsteroids = new int[asteroidsDeque.size()];
        int i=0;
        for(int val : asteroidsDeque) {
            remainingAsteroids[i++] = val;
        } 

        return remainingAsteroids;
    }
}