class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0, tank = 0, startIndex = 0;
        for(int i=0; i<gas.length; ++i) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank = tank + gas[i] - cost[i];
            
            if(tank < 0) {
                tank = 0;
                startIndex = i+1;
            }
        }

        return totalCost>totalGas ? -1: startIndex;
    }
}