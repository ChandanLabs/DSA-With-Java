class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = 0;
        int current_gas = 0;
        int max_gas = 0;
        for(int i = 0; i < gas.length; i++){
            int max_gas_diff = gas[i] - cost[i];
            max_gas = max_gas + max_gas_diff;
            current_gas = current_gas + max_gas_diff;

            if(current_gas < 0){
                index = i + 1;
                current_gas = 0;
            } 
        }

        return max_gas >= 0 ? index : -1;
    }
}