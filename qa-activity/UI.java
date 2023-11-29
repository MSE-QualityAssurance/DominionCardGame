import java.util.Scanner;

/**
 * Handles all text-based user interactions for the Dominion game.
 * This includes displaying game state and receiving player input.
 */
public class UI {
    private Scanner scanner;

    /**
     * Constructor for the UI class.
     */
    public UI() {
        scanner = new Scanner(System.in);
    }

    /**
     * Displays a message to the user.
     *
     * @param message The message to be displayed.
     */
    public void displayMessage(String message) {
        System.out.println(message);
    }

    /**
     * Asks a question to the user and returns the response.
     *
     * @param question The question to ask the user.
     * @return The user's response as a string.
     */
    public String askQuestion(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    /**
     * Asks the user to choose an option from a list of choices.
     *
     * @param prompt   The prompt to display before the choices.
     * @param choices  An array of choices for the user to select from.
     * @return The index of the chosen option.
     */
    public int chooseOption(String prompt, String[] choices) {
        System.out.println(prompt);
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character from the input stream
        return choice - 1; // Adjust for 0-based index
    }

    // Additional UI methods can be added as needed
}
