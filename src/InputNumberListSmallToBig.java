import java.util.Scanner;


// Write a java program that takes a number of inputs that user wants to take. Let the user enter all their inputs. Print out the largest and smallest.
public class InputNumberListSmallToBig {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number of numbers you want to check: ");
        int numberOfNumbers = numberCheck();
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        System.out.println("Enter " + numberOfNumbers + " numbers.");
        for (int i = 0; i < numberOfNumbers; i++) {
            int numberInput = numberCheck();

            if (numberInput > maxNumber) {
                maxNumber = numberInput;
            }
            if (numberInput < minNumber) {
                minNumber = numberInput;
            }

        }

        System.out.println("The bolshoy number is " + maxNumber);
        System.out.println("The small number is " + minNumber);
    }

    static int numberCheck() {
        Scanner userInput = new Scanner(System.in);
        while (!userInput.hasNextInt()) {
            System.err.println("Invalid number, please try again.");
            userInput.nextLine();
        }


        return userInput.nextInt();
    }


}


