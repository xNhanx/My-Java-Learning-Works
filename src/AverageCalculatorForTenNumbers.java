import java.util.Scanner;

public class AverageCalculatorForTenNumbers {
    public static void main(String[] args) {
        double sum = 0;
        double average = 0;
        System.out.println("Please put in 10 numbers to find out the sum and average: ");


        Scanner userInput = new Scanner(System.in);
        double[] averageOf10Numbers = new double[10];
        // This will get you your array of user inputs.

        /*
            Number 1: ...
            Number 2: ...

         */
        for (int i = 0; i < averageOf10Numbers.length; i++) {
            System.out.printf("Number %d: ", i + 1);
            averageOf10Numbers[i] = userInput.nextDouble();

        }
        // This will get the sum of the array of user inputs.
        for (int i = 0; i < averageOf10Numbers.length; i++) {
            sum = sum + averageOf10Numbers[i];
            average = sum / 10;
        }
        System.out.printf("The sum of the numbers you inputted comes out to be: %.0f\n", sum);
        System.out.printf("The average sum of the numbers you inputted comes out to be: %z.2f\n", average);
        System.out.println("Nice numbers!");
    }

}




