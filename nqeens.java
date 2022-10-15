public class nqeens {
    public static void main(String[] args) {

    }


    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return;

        }
        int count = 0;

        for (int col = 0; col < board.length; col++) ;

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            count += queens(board, row + 1);
            board[row][col];
        }
    }
    return count;
}
    private satic boolean isSafe(boolean)

    public static void display(boolean[][] board) {

        for(boolean[] row :board){
            for(boolean)
        }

    }
}
