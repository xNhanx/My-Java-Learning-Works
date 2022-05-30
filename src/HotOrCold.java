import java.util.Scanner;

public class HotOrCold {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Hot or Cold! Player 1, please input a number between 0 - 100");
        System.out.print("Player 1, enter a number to be guessed: ");
        int playerOneChoice = playerChoices();
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        int playerTwoChoice;
        System.out.print("Player 2, guess the number Player 1 has chosen: ");
        playerTwoChoice = playerChoices();

        while (playerTwoChoice != playerOneChoice) {
            if (playerTwoChoice > playerOneChoice) {
                System.err.print("You are HOT! Try again: ");
            } else {
                System.err.print("You are COLD! Try again: ");
            }
            playerTwoChoice = playerChoices();
        }
        System.out.println("Correct!");
    }

    static int playerChoices() {
        Scanner userInput = new Scanner(System.in);
        while (!userInput.hasNextInt()) {
            System.err.print("Invalid input, please try again: ");
            userInput.nextLine();
        }
        int input = userInput.nextInt();
        if (input > 100 || input < 0) {
            System.err.print("Please input a number between 0 - 100: ");
            return playerChoices();
        }
        return input;
    }
}
