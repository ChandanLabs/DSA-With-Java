class Solution {
    public int countPrimes(int n) {
        if(n < 2){
            return 0;
        }
        boolean isPrime[] = new boolean[n];

        Arrays.fill(isPrime, true);

        int sqrtn = (int)Math.sqrt(n);
        for(int i = 2; i <= sqrtn; i++){
            if(isPrime[i]){
                for(int j = i * i; j < n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
            int count = 0;
            for(int i = 2; i < n; i++){
                if(isPrime[i]){
                    count++;
                    // return count;
                }
            }
        
        return count;
    }
}