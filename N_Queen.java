class Solution {
    public void saveBoard(char[][] board,List<List<String>>allBoard){
        String row = "";
        List<String>newBoard = new ArrayList<>();

        for(int i = 0; i<board.length; i++){
            row = "";
            for(int j = 0; j < board.length; j++){
                if(board[i][j]=='Q')
                     row = row + 'Q';
                else
                     row = row + '.';
            }
            newBoard.add(row);
        }
        allBoard.add(newBoard);
    }
    public boolean isSave(char[][]board,int row,int col,int n){
        int i,j;
        //check for left row
        for ( i = 0; i < col; i++) {
            if (board[row][i]=='Q'){
                return false;
            }
        }

        //check for upper diagonal left
        for ( i = row, j = col; i >= 0 && j >= 0 ; i--,j--) {
            if (board[i][j]=='Q'){
                return false;
            }
        }

        //check for lower diagonal left
        for (i = row, j = col; i < n && j >= 0; i++,j--){
            if (board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }
    public void helper(char[][] board, List<List<String>>allBoard, int col, int n){
        //Base Case Condition
        if(col==n){
          saveBoard(board,allBoard);
          return;
        }

        for(int row = 0; row < n; row++){
            if(isSave(board,row,col,n)){
                board[row][col] = 'Q';
                helper(board,allBoard,col+1,n);
                //BackTracking
                board[row][col] = '.';
            }
        }

    }
    public List<List<String>> solveNQueens(int n) 
    {
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,allBoard,0,n);
        return allBoard;
    }
}
