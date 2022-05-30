import java.util.Scanner;

public class CharacterApp {


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to World of Warlords");
        System.out.println("Here you can create your character: ");

        System.out.print("Name: ");
        String name = userInput.nextLine();

        System.out.println("Race (human or orc): ");

        // yes it's presenting again BECAUSE of the hasNext() not the nextLine()
        // do you see how the condition is hasNext()?
        // the condition itself will trigger the input again
        while (!userInput.hasNext("human") && !userInput.hasNext("orc")) {
            System.err.println("Invalid input, you need to type in human or orc.");
            userInput.nextLine();
        }
        String race = userInput.nextLine();
    }

}
