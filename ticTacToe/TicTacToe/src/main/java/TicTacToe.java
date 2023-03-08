public class TicTacToe {
    private final Board board;
    private final Console console;
    private final Player player1;
    private final Player player2;

    public TicTacToe() {

        console = new Console();

        console.print("Welcome to Tic Tac Toe!");
        console.print("Would you like to play with an opponent or against a computer? O/C");
        String opponentChoice = console.readString().toUpperCase();

        while (!opponentChoice.equals("O") && !opponentChoice.equals("C")) {
            console.print("Invalid move! Choose an opponen oraz computer O/C");
            opponentChoice = console.readString().toUpperCase();
        }

        if(opponentChoice.equals("O")){

        }
        console.print("Player 1, enter your name:");
        String player1Name = console.readString();
        console.print(player1Name + ", choose your marker (X or O):");
        String player1Marker = console.readString().toUpperCase();
        while (!player1Marker.equals("X") && !player1Marker.equals("O")) {
            console.print("Invalid marker! Choose X or O:");
            player1Marker = console.readString().toUpperCase();
        }
        player1 = new Player(player1Name, player1Marker);

        console.print("Player 2, enter your name:");
        String player2Name = console.readString();
        String player2Marker = player1Marker.equals("X") ? "O" : "X";
        player2 = new Player(player2Name, player2Marker);

        board = new Board();
    }

    public void start() {
        boolean player1Turn = true;
        while (!board.isGameOver()) {
            board.display(console);
            Player currentPlayer = player1Turn ? player1 : player2;
            int squareNum = currentPlayer.makeMove(board);
            String marker = currentPlayer.getMarker();
            board.updateBoard(squareNum, marker);
            player1Turn = !player1Turn;
        }
        board.display(console);
        String winner = board.getWinner();
        if (winner != null) {
            console.print("Congratulations, " + winner + "! You have won the game!");
        } else {
            console.print("It's a draw!");
        }
        playAgain();
    }

    public void playAgain() {
        console.print("Do you want to play again? (Y/N)");
        String answer = console.readString().toUpperCase();
        while (!answer.equals("Y") && !answer.equals("N")) {
            console.print("Invalid input! Do you want to play again? (Y/N)");
            answer = console.readString().toUpperCase();
        }
        if (answer.equals("Y")) {
            board.reset();
            start();
        } else {
            console.print("Thanks for playing!");
        }
    }
}