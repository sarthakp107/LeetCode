class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row++){
            Set<Character> seen = new HashSet<>();
            for(int i = 0 ; i < 9 ; i++){
                if(board[row][i] == '.'){
                    continue;
                }
                if(seen.contains(board[row][i])){
                    return false;
                }
                seen.add(board[row][i]);
            }
        }

        for(int col = 0 ; col < 9; col++){
            Set<Character> seen = new HashSet<>();
            for(int i = 0 ; i < 9 ; i++){
                if(board[i][col] == '.'){
                    continue;
                }
                if(seen.contains(board[i][col])){
                    return false;
                }
                seen.add(board[i][col]);
            }
        }

        //case 3 T_T
        //each square ill create a new hasset to compare them square
        for(int sq= 0; sq < 9 ; sq ++){
            Set<Character> seen = new HashSet<>();
            for(int i = 0 ; i < 3; i++){
                for(int j = 0 ; j < 3; j++){
                    int row = (sq / 3) * 3 + i;
                    int col = (sq % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }
        return true;
    }
}