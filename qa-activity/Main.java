public class Main {
    public static void main(String[] args) {
        // Create an instance of the game
        Game game = new Game();

        // Initialize the UI
        UI ui = new UI();

        // Add players to the game
        // This can be based on user input or a fixed number for demonstration
        String playerName = ui.askQuestion("Enter player name:");
        game.addPlayer(new Player(playerName));

        // Additional player setup can be done here (e.g., adding more players)

        // Initialize the game with necessary setup
        // This includes setting up supply piles and players' decks
        game.setupGame();

        // Start the game
        game.startGame();

        // Game loop and logic will be handled within the Game class
    }
}
