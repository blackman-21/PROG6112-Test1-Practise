import javax.swing.JOptionPane;
import java.util.Random;

public class TicTacToe2 {
    private static char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private static Random rand = new Random();

    public static void main(String[] args) {
        boolean gameOver = false;
        char currentPlayer = 'X'; // Player starts first

        while (!gameOver) {
            displayBoard();
            if (currentPlayer == 'X') {
                playerMove();
            } else {
                computerMove();
            }
            gameOver = checkWin() || checkTie();
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch between player and computer
        }
        displayBoard();
    }

    // Display the current state of the board
    private static void displayBoard() {
        String boardState =
                board[0] + " | " + board[1] + " | " + board[2] + "\n" +
                        "--+---+--\n" +
                        board[3] + " | " + board[4] + " | " + board[5] + "\n" +
                        "--+---+--\n" +
                        board[6] + " | " + board[7] + " | " + board[8] + "\n";
        JOptionPane.showMessageDialog(null, boardState, "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
    }

    // Player's move: ask for input and place 'X'
    private static void playerMove() {
        boolean validMove = false;
        while (!validMove) {
            String input = JOptionPane.showInputDialog(null, "Enter a position (1-9) for X:");
            int move = Integer.parseInt(input) - 1; // Convert to 0-based index

            if (move >= 0 && move < 9 && board[move] != 'X' && board[move] != 'O') {
                board[move] = 'X';
                validMove = true;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid move! Try again.");
            }
        }
    }

    // Computer's move: place 'O' strategically or randomly
    private static void computerMove() {
        if (!tryToWin()) {
            // If no winning move is available, pick a random move
            boolean validMove = false;
            while (!validMove) {
                int move = rand.nextInt(9); // Generate random number between 0 and 8
                if (board[move] != 'X' && board[move] != 'O') {
                    board[move] = 'O';
                    validMove = true;
                }
            }
            JOptionPane.showMessageDialog(null, "Computer placed O.");
        }
    }

    // Check if the computer can win
    private static boolean tryToWin() {
        int[][] winConditions = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Rows
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columns
                {0, 4, 8}, {2, 4, 6}             // Diagonals
        };

        for (int[] condition : winConditions) {
            if (board[condition[0]] == 'O' && board[condition[1]] == 'O' && board[condition[2]] != 'X' && board[condition[2]] != 'O') {
                board[condition[2]] = 'O';
                JOptionPane.showMessageDialog(null, "Computer placed O and won!");
                return true;
            } else if (board[condition[0]] == 'O' && board[condition[2]] == 'O' && board[condition[1]] != 'X' && board[condition[1]] != 'O') {
                board[condition[1]] = 'O';
                JOptionPane.showMessageDialog(null, "Computer placed O and won!");
                return true;
            } else if (board[condition[1]] == 'O' && board[condition[2]] == 'O' && board[condition[0]] != 'X' && board[condition[0]] != 'O') {
                board[condition[0]] = 'O';
                JOptionPane.showMessageDialog(null, "Computer placed O and won!");
                return true;
            }
        }
        return false; // No winning move found
    }

    // Check if there is a win
    private static boolean checkWin() {
        int[][] winConditions = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Rows
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columns
                {0, 4, 8}, {2, 4, 6}             // Diagonals
        };

        for (int[] condition : winConditions) {
            if (board[condition[0]] == board[condition[1]] && board[condition[1]] == board[condition[2]]) {
                JOptionPane.showMessageDialog(null, board[condition[0]] + " wins!");
                return true;
            }
        }
        return false;
    }

    // Check if there is a tie (all spots are filled)
    private static boolean checkTie() {
        for (char c : board) {
            if (c != 'X' && c != 'O') {
                return false; // If there's any empty space, it's not a tie
            }
        }
        JOptionPane.showMessageDialog(null, "It's a tie!");
        return true;
    }
}
