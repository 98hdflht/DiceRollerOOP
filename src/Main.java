import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String choice = "y";
        Scanner sc = new Scanner(System.in);
        // Initial statements not to be repeated
        System.out.println("Welcome to the Dice Roller!");
        System.out.print("Roll the dice? ");
        choice = sc.nextLine();
        // Bulk of the program
        while (choice.equalsIgnoreCase("y")) {
            Dice dice = new Dice();
            dice.roll();
            dice.printRoll();

            // To see if more rolls are needed
            System.out.print("Roll again? (y/n): ");
            choice = sc.nextLine();
        }
    }
}