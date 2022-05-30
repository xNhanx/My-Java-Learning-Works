import java.util.Random;
import java.util.Scanner;
// How do you make user inputs capitalized?
// How do you refer to the user's past inputs?
/*
            Welcome to TicTacToe.
            Player 1, enter your choice of marking. (O) or (X)
            Marking set, start the game by choosing where to place your marking on the grid.
            Print Board.
            Player Input.!
            Second Player Inputs. !
            (Update/print board based on each player input. Repeats until 3 of the same markings are placed on the grid or if the entire grid has been used up.)!
            Player (1/2) wins!
            End of code.

         */

public class TicTacToeGame {
    public static void main(String[] args) {
        int turn = 0;
        Scanner userInput = new Scanner(System.in);
        String[][] ticTacToeGrid = new String[3][3];
        for (int row = 0; row < ticTacToeGrid.length; row++) {
            for (int column = 0; column < ticTacToeGrid[row].length; column++) {
                ticTacToeGrid[row][column] = "_";
            }
        }
        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Indicate your place of marking by picking which row you want to place your mark, followed by the column from \"0\" to \"2.\"");
        System.out.print("Player 1, choose your desired marking \"O\" or \"X\" : ");
        String Player2;
        String Player1 = userInput.nextLine();
        if (Player1.equals("O")) {
            Player2 = "X";
        } else {
            Player2 = "O";
        }
        printGrid(ticTacToeGrid);
        while (true) {
            String currentPlayer;
            if (turn % 2 == 0) {
                currentPlayer = Player1;
                System.out.println("It's Player 1's turn!");
            } else {
                currentPlayer = Player2;
                System.out.println("It's Player 2's turn!");
            }
            System.out.print("Which row do you want to put your marking: ");
            int row = gridInput();
            System.out.print("Which column do you want to put your marking: ");
            int column = gridInput();
            if (!ticTacToeGrid[row][column].equals("_")) {
                System.err.println("That space has already been marked. Pick another place to place your marking.");
                continue;

            }
            ticTacToeGrid[row][column] = currentPlayer;
            printGrid(ticTacToeGrid);
            for (int i = 0; i < ticTacToeGrid.length; i++) {
                int repeatCount = 0;
                for (int k = 0; k < ticTacToeGrid[row].length; k++) {
                    if (ticTacToeGrid[i][k].equals(currentPlayer)) {
                        repeatCount++;
                    }
                }
                if (repeatCount == 3) {
                    System.out.println("You win!");
                    System.exit(0);
                }
            }

            for (int i = 0; i < ticTacToeGrid.length; i++) {
                int repeatCount = 0;
                for (int k = 0; k < ticTacToeGrid[row].length; k++) {
                    if (ticTacToeGrid[k][i].equals(currentPlayer)) {
                        repeatCount++;
                    }
                }
                if (repeatCount == 3) {
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            int repeatCount = 0;
            for (int i = 0; i < ticTacToeGrid.length; i++) {

                if (ticTacToeGrid[i][i].equals(currentPlayer)) {
                    repeatCount++;
                }


            }
            if (repeatCount == 3) {
                System.out.println("You win!");
                System.exit(0);
            }
            repeatCount = 0;
            for (int i = 0; i < ticTacToeGrid.length; i++) {
                if (ticTacToeGrid[i][2 - i].equals(currentPlayer)) {
                    repeatCount++;
                }

            }
            if (repeatCount == 3) {
                System.out.println("You win!");
                System.exit(0);
            }


            turn++;
        }


    }

    static void printGrid(String[][] ticTacToeGrid) {
        for (int row = 0; row < ticTacToeGrid.length; row++) {
            for (int column = 0; column < ticTacToeGrid[row].length; column++) {
                System.out.print(ticTacToeGrid[row][column]);
            }
            System.out.println();
        }
    }

    static int gridInput() {
        Scanner userInput = new Scanner(System.in);
        while (!userInput.hasNext()) {
            System.err.print("Not a valid initial input, try again.");
            userInput.nextLine();
        }
        int input = userInput.nextInt();
        if (input > 2 || input < 0) {
            System.err.print("Not a valid secondary input, try again.");
            return gridInput();
        }
        return input;
    }
}