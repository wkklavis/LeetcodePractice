package Demo06;

public class Exist {
    public static void main(String[] args) {
        System.out.println(exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED"));
    }
    public static boolean exist(char[][] board, String word) {
        boolean[][] mark = new boolean[board.length][board[0].length];
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (result==true)return true;
                if (board[i][j]==word.charAt(0))result = result||backTracking(board,i,j,mark,word,0);
            }
        }
        return result;
    }

    private static boolean backTracking(char[][] board, int i, int j,boolean[][] mark,String word, int pos) {
        if (pos==word.length())return true;
        if (i<0||j<0||i>=board.length||j>=board[0].length)return false;
        if (mark[i][j]==true)return false;
        if (board[i][j]!=word.charAt(pos))return false;
        mark[i][j]=true;
        boolean result =  backTracking(board,i-1,j,mark,word,pos+1)||
                          backTracking(board,i,j-1,mark,word,pos+1)||
                          backTracking(board,i+1,j,mark,word,pos+1)||
                          backTracking(board,i,j+1,mark,word,pos+1);
        mark[i][j]=false;
        return result;

    }
}
