import java.util.Random;
import java.util.Scanner;
// Print Happy Birthday to you, happy birthday to you, happy birthday dear -name- Happy birthday to you! Are you 1.. are you 2..

public class CodingForDummies {
    public static void main(String[] args) {
        String firstName = "Nhan";
        char middleName = 'T';
        String lastName = "Dang";
        boolean isFormal = false;
        int ageNumber;
        String fullName = firstName + " " + middleName + " " + lastName;
        Random rand = new Random();
        String printName = firstName;
        int print = rand.nextInt();
        if (print % 2 == 0) {
            isFormal = true;
            printName = fullName;
        }
        greet(isFormal, printName);
        System.out.println();
        System.out.println("How old are you?");
        ageNumber = takeInt();
        System.out.println("Happy birthday to you! Happy birthday to you! Happy birthday dear " + fullName + "!" + " Happy birthday to you!");
        for (int i = 0; i < ageNumber; i++) {
            int areYou = 1;
            areYou = areYou + i;
            if (ageNumber <= 8) {
                System.out.println("Are you " + areYou);
            }

        }
    }

    static void greet(boolean isFormal, String printName) {
        if (isFormal == true) {
            System.out.print("Mr. ");
        } else {
            System.out.print("Yo ");
        }
        System.out.print(printName);
    }

    static int takeInt() {
        Scanner userInput = new Scanner(System.in);
        while (!userInput.hasNextInt()) {
            System.err.println("Invalid input, please try again.");
            userInput.nextLine();
        }

        return userInput.nextInt();
    }
}

