import java.util.Collections;

public class Game {
    private List<Player> players;
    private List<SupplyPile> supplyPiles;
    private int currentPlayerIndex;

    public Game() {
        players = new ArrayList<>();
        supplyPiles = new ArrayList<>();
        currentPlayerIndex = 0;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void addSupplyPile(SupplyPile supplyPile) {
        supplyPiles.add(supplyPile);
    }

    public void startGame() {
        // Initialize players' decks and the supply piles
        initializePlayers();
        initializeSupplyPiles();

        // Game loop
        while (!isGameOver()) {
            Player currentPlayer = players.get(currentPlayerIndex);
            currentPlayer.takeTurn();

            // Update turn order
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }

        declareWinner();
    }

    private void initializePlayers() {
        // Initialize each player's deck and starting hand here
        // This might involve giving them starting treasure and victory cards
        for (Player player : players) {
            // Player initialization logic
        }
    }

    private void initializeSupplyPiles() {
        // Initialize the supply piles with the required cards
        // Include various action, treasure, victory, and curse cards as per game rules
    }

    private boolean isGameOver() {
        // Check if the Province card pile is empty
        boolean provinceEmpty = isPileEmpty("Province");

        // Check if any three supply piles are empty
        int emptyPiles = 0;
        for (SupplyPile pile : supplyPiles) {
            if (pile.isEmpty()) {
                emptyPiles++;
            }
        }

        return provinceEmpty || emptyPiles >= 3;
    }

    private boolean isPileEmpty(String cardName) {
        for (SupplyPile pile : supplyPiles) {
            if (pile.getCardName().equals(cardName) && pile.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private void declareWinner() {
        Player winner = null;
        int highestScore = 0;

        for (Player player : players) {
            int score = player.calculateVictoryPoints();
            if (score > highestScore) {
                highestScore = score;
                winner = player;
            } else if (score == highestScore) {
                // In case of a tie, you can decide the tie-breaker rule
                // For example, the player with fewer turns wins, or it remains a tie
            }
        }

        // Announce winner
        if (winner != null) {
            System.out.println("The winner is " + winner.getName() + " with " + highestScore + " victory points!");
        } else {
            System.out.println("The game is a tie!");
        }
    }
}
