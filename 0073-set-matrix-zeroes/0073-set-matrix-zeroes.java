class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // int[] arr = new int[n];
        boolean[] rowHasZero = new boolean[n];
        boolean[] columnHasZero = new boolean[m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    rowHasZero[i] = true;
                    columnHasZero[j] = true;
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(rowHasZero[i] || columnHasZero[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}