/**
 * Represents an action card in the Dominion game.
 * Action cards have special effects when played.
 */
public class ActionCard extends Card {
    // Additional properties specific to action cards can be added here

    /**
     * Constructor for the ActionCard class.
     *
     * @param name The name of the action card.
     * @param cost The cost of the action card in coins.
     */
    public ActionCard(String name, int cost) {
        super(name, cost);
    }

    /**
     * Executes the action associated with this card.
     * (This method will be implemented to include specific action logic.)
     */
    public void executeAction() {
        // Action logic goes here
    }
}
