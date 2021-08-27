package Demo03;

public class IsValidSudoku {
    public static void main(String[] args) {
        String[][] board = new String[][]{
                {"8","3",".",".","7",".",".",".","."},
                {"6",".",".","1","9","5",".",".","."},
                {".","9","8",".",".",".",".","6","."},
                {"8",".",".",".","6",".",".",".","3"},
                {"4",".",".","8",".","3",".",".","1"},
                {"7",".",".",".","2",".",".",".","6"},
                {".","6",".",".",".",".","2","8","."},
                {".",".",".","4","1","9",".",".","5"},
                {".",".",".",".","8",".",".","7","9"}};
        char[][]board1 = new char[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board1[i][j] = board[i][j].charAt(0);
            }
        }
        System.out.println(isValidSudoku(board1));
    }
    public static boolean isValidSudoku(char[][] board) {
        int[][]col = new int[9][9];
        int[][]row = new int[9][9];
        int[][]box = new int[9][9];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]=='.')continue;
                if (row[i][board[i][j]-'1']==0)row[i][board[i][j]-'1'] = 1;
                else return false;
                if (col[j][board[i][j]-'1']==0)col[j][board[i][j]-'1'] = 1;
                else return false;
                if (box[i/3*3+j/3][board[i][j]-'1']==0)box[i/3*3+j/3][board[i][j]-'1'] = 1;
                else return false;
            }
        }
        return true;
    }
}
