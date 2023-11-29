/**
 * Represents a victory card in the Dominion game.
 * Victory cards contribute to the player's victory points at the end of the game.
 */
public class VictoryCard extends Card {
    private int points;

    /**
     * Constructor for the VictoryCard class.
     *
     * @param name   The name of the victory card.
     * @param cost   The cost of the victory card in coins.
     * @param points The victory points provided by the card.
     */
    public VictoryCard(String name, int cost, int points) {
        super(name, cost);
        this.points = points;
    }

    /**
     * Gets the victory points of the card.
     *
     * @return The victory points.
     */
    public int getPoints() {
        return points;
    }
}
