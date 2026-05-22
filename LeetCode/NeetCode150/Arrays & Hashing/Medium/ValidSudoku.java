class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rowSet = new HashSet[9];
        Set<Character>[] colSet = new HashSet[9];
        Set<Character>[] quadSet = new HashSet[9];

        for(int i = 0; i < 9; ++i) {
            rowSet[i] = new HashSet<Character>();
            colSet[i] = new HashSet<Character>();
            quadSet[i] = new HashSet<Character>();
        }

        for(int i = 0; i < 9; ++i) {
            for(int j = 0; j < 9; ++j) {
                if(board[i][j]=='.') continue;
                if(rowSet[i].add(board[i][j]) == false) return false;
                if(colSet[j].add(board[i][j]) == false) return false;
                if(quadSet[((i/3)*3)+(j/3)].add(board[i][j]) == false) return false;
            }
        }
        return true;
    }
}