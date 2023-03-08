class Board {
    private String[] board;
    private final int[][] winConditions = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Rows
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columns
            {0, 4, 8}, {2, 4, 6} // Diagonals
    };

    public Board() {
        board = new String[9];
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i+1);
        }
    }

    public boolean isSquareEmpty(int squareNum) {
        return board[squareNum-1].equals(String.valueOf(squareNum));
    }

    public void updateBoard(int squareNum, String marker) {
        board[squareNum-1] = marker;
    }

    public boolean isGameOver() {
        return getWinner() != null || isDraw();
    }

    public boolean isDraw() {
        for (int i = 0; i < 9; i++) {
            if (board[i].equals(String.valueOf(i+1))) {
                return false;
            }
        }
        return true;
    }

    public String getWinner() {
        String winner = null;
        for (int[] condition : winConditions) {
            String line = board[condition[0]] + board[condition[1]] + board[condition[2]];
            if (line.equals("XXX")) {
                winner = "X";
                break;
            }
            else if (line.equals("OOO")) {
                winner = "O";
                break;
            }
        }
        return winner;
    }

    public void display(Console console) {
        console.print(board[0] + " | " + board[1] + " | " + board[2]);
        console.print("--+---+--");
        console.print(board[3] + " | " + board[4] + " | " + board[5]);
        console.print("--+---+--");
        console.print(board[6] + " | " + board[7] + " | " + board[8]);
        console.print("");
    }
    public void reset() {
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i+1);
        }
    }
}