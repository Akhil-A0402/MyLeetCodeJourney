package 134 Gas Station;

public class Solution2Passed {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum =0, costSum =0;
        for(int i=0;i<gas.length;i++) {
            gasSum+=gas[i];
            costSum+=cost[i];
        }

        if(gasSum<costSum) {
            return -1;
        }

        int start = 0;
        int currentGas = 0;

        for(int i=0;i<gas.length;i++) {
            currentGas += gas[i] - cost[i];
            if(currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }

        return start;
    }
}
