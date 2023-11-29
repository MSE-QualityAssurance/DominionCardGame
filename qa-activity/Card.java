/**
 * Represents a generic card in the Dominion game.
 * This class will be the base class for specific types of cards like Action, Treasure, Victory, and Curse cards.
 */
public abstract class Card {
    private String name;
    private int cost;

    /**
     * Constructor for the Card class.
     *
     * @param name The name of the card.
     * @param cost The cost of the card in coins.
     */
    public Card(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    /**
     * Gets the name of the card.
     *
     * @return The name of the card.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the cost of the card.
     *
     * @return The cost of the card in coins.
     */
    public int getCost() {
        return cost;
    }

    /**
     * Provides a string representation of the card, including its name and cost.
     *
     * @return A string representation of the card.
     */
    @Override
    public String toString() {
        return "Card{name='" + name + "', cost=" + cost + '}';
    }
}
