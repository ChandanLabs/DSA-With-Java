class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> colSet[] = new HashSet[9];
        HashSet<Character> boxSet[] = new HashSet[9];

        for(int k = 0; k < 9; k++) {
            colSet[k] = new HashSet<>();
            boxSet[k] = new HashSet<>();
        }
        for(int i = 0; i < 9; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            for(int j = 0; j < 9; j++) {
                char val = board[i][j];
                int idx = (i / 3) * 3 + (j / 3);

                if(val == '.') continue;

                else{
                    if(rowSet.contains(val) || colSet[j].contains(val) || boxSet[idx].contains(val)) {
                        return false;
                    }
                    rowSet.add(val);
                    colSet[j].add(val);
                    boxSet[idx].add(val);
                }
            }
        }
        return true;
    }
}