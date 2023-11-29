/**
 * Represents a curse card in the Dominion game.
 * Curse cards are negative points that affect players' final scores.
 */
public class CurseCard extends Card {
    private int negativePoints;

    /**
     * Constructor for the CurseCard class.
     *
     * @param name          The name of the curse card.
     * @param cost          The cost of the curse card in coins.
     * @param negativePoints The negative points of the curse card.
     */
    public CurseCard(String name, int cost, int negativePoints) {
        super(name, cost);
        this.negativePoints = negativePoints;
    }

    /**
     * Gets the negative points of the curse card.
     *
     * @return The negative points.
     */
    public int getNegativePoints() {
        return negativePoints;
    }
}
