/**
 * Represents a treasure card in the Dominion game.
 * Treasure cards provide coins when played.
 */
public class TreasureCard extends Card {
    private int value;

    /**
     * Constructor for the TreasureCard class.
     *
     * @param name  The name of the treasure card.
     * @param cost  The cost of the treasure card in coins.
     * @param value The coin value provided by the treasure card.
     */
    public TreasureCard(String name, int cost, int value) {
        super(name, cost);
        this.value = value;
    }

    /**
     * Gets the coin value of the treasure card.
     *
     * @return The coin value.
     */
    public int getValue() {
        return value;
    }
}
