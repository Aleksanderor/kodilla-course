import java.util.Scanner;

class Player {
    private final String name;
    private final String marker;

    public Player(String name, String marker) {
        this.name = name;
        this.marker = marker;
    }

    public String getName() {
        return name;
    }

    public String getMarker() {
        return marker;
    }

    public int makeMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(name + "'s turn. Enter a square number (1-9): ");
        int squareNum = scanner.nextInt();

        // Check for valid input
        while (squareNum < 1 || squareNum > 9 || !board.isSquareEmpty(squareNum)) {
            System.out.print("Invalid move :( Enter a square number (1-9): ");
            squareNum = scanner.nextInt();
        }

        return squareNum;
    }

}

