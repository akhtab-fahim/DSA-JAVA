public class SudokuSolver {
    static boolean isSafe(int board[][],int row,int col,int num){
        for (int i = 0; i < board.length; i++) {
            if(board[row][col]== num){
                return false;
            }
        }
    }
}
