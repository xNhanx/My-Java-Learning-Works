import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// 1) Create a welcoming interface.
// 2) Create methods that will do the following: Provide a features like: Deposit money, Withdraw money, Check balance, Print Receipt, and Exit ATM. [X]
// 3) Deposit Money - Will ask how much money to put in, and will print the resulted balance. [X]
// 4) Withdraw Money - Will ask how much money to take out, while showing available balance.[X]
// 5) Check balance - Simply print available balance
// 6) Print Receipt - Ask user whether they want to print a receipt after the transaction process for  deposit or withdraw money.
// 7) Exit ATM - Add a exit feature.
// 8) Bonus challenge - Make a print receipt option using String Array
// Print Receipt =
// Deposited x
// Withdrew x
// Deposited x
// Deposited x
// Withdrew x
// Current balance = x
public class ATMMachines {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<String> activityCounter = new ArrayList();
        Scanner userInput = new Scanner(System.in);
        double balance = rand.nextDouble(1000, 10000);

        System.out.println("Welcome to DANG BANKING. ");
        System.out.println("What would you like to do today?");
        while (true) {
            String customerInput = atmOptions();
            if (customerInput.equals("Deposit")) {
                balance = Deposit(activityCounter) + balance;
                System.out.println("Your current balance is: " + balance);
                System.out.println("Would you like to return to the main interface? [Yes] [No]");
                String input = userInput.nextLine();
                if (input.equals("No")) {
                    System.out.println("Thank you for using Dang Banking. Have a nice day!");
                    System.exit(0);

                }

            }

            if (customerInput.equals("Withdraw")) {
                balance = balance - Withdraw(balance, activityCounter);
                System.out.println("Your current balance is: " + balance);
                System.out.println("Would you like to return to the main interface? [Yes] [No]");
                String input = userInput.nextLine();
                if (input.equals("No")) {
                    System.out.println("Thank you for using Dang Banking. Have a nice day!");
                    System.exit(0);

                }

            } else if (customerInput.equals("Exit")) {
                System.out.println("Thank you for using Dang Banking. Have a nice day!");
                System.exit(0);
            } else if (customerInput.equals("Check Balance")) {
                System.out.println("Your current balance is " + balance);
                System.out.println("Would you like to return to the main interface? [Yes] [No]");
                String input = userInput.nextLine();
                if (input.equals("No")) {
                    System.out.println("Thank you for using Dang Banking. Have a nice day!");
                    System.exit(0);


                }


            } else if (customerInput.equals("Print Receipt")) {
                for (int i = 0; i < activityCounter.size(); i++) {
                    System.out.println(activityCounter.get(i));


                }
                System.out.println("Would you like to return to the main interface? [Yes] [No]");
                String input = userInput.nextLine();


                if (input.equals("No")) {
                    System.out.println("Thank you for using Dang Banking. Have a nice day!");
                    System.exit(0);

                }
            }

            continue;
        }
    }

    static String atmOptions() {
        Scanner userInput = new Scanner(System.in);
        System.out.println(" |Deposit| " + " |Withdraw| " + " |Check Balance| " + " |Print Receipt|" + " |Exit| ");
        String input = userInput.nextLine();
        while (!input.equals("Deposit") && !input.equals("Withdraw") && !input.equals("Check Balance") && !input.equals("Print Receipt") && !input.equals("Exit")) {
            System.err.println("Invalid response. Please try again.");
            input = userInput.nextLine();


        }
        return input;


    }

    static double Deposit(ArrayList<String> activityCounter) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the amount of money you would like to deposit: ");
        while (!userInput.hasNextDouble()) {
            System.err.println("Not a valid input. Please try again.");
            userInput.nextLine();
        }

        double input = userInput.nextDouble();
        if (input <= 0) {
            System.err.println("You can't request a negative deposit! Try again.");
            return Deposit(activityCounter);
        }
        activityCounter.add("Deposited: " + input);
        return input;
    }

    static double Withdraw(double balance, ArrayList<String> activityCounter) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Current available balance: " + balance);
        System.out.println("Enter the amount of money you would like to withdraw: ");
        while (!userInput.hasNextDouble()) {
            System.err.println("Not a valid input. Please try again.");
            userInput.nextLine();

        }
        double input = userInput.nextDouble();
        if (input <= 0 || input > balance) {
            System.err.println("Invalid withdrawal request. Please input an amount based on your available balance.");
            return Withdraw(balance, activityCounter);

        }
        activityCounter.add("Withdrew: " + input);
        return input;
    }


}


