import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a player's deck in the Dominion game.
 * It includes the draw pile, discard pile, and hand.
 */
public class Deck {
    private List<Card> drawPile;
    private List<Card> discardPile;
    private List<Card> hand;

    /**
     * Constructor for the Deck class.
     */
    public Deck() {
        drawPile = new ArrayList<>();
        discardPile = new ArrayList<>();
        hand = new ArrayList<>();
    }

    /**
     * Adds a card to the discard pile.
     *
     * @param card The card to be added to the discard pile.
     */
    public void addCardToDiscard(Card card) {
        discardPile.add(card);
    }

    /**
     * Shuffles the draw pile.
     */
    public void shuffleDrawPile() {
        Collections.shuffle(drawPile);
    }

    /**
     * Draws a card from the draw pile.
     * If the draw pile is empty, shuffles the discard pile and moves it to the draw pile.
     *
     * @return The drawn card, or null if both draw and discard piles are empty.
     */
    public Card drawCard() {
        if (drawPile.isEmpty()) {
            drawPile.addAll(discardPile);
            discardPile.clear();
            shuffleDrawPile();
        }

        return drawPile.isEmpty() ? null : drawPile.remove(drawPile.size() - 1);
    }

    /**
     * Adds a card to the player's hand.
     *
     * @param card The card to be added to the hand.
     */
    public void addCardToHand(Card card) {
        hand.add(card);
    }

    /**
     * Discards a card from the hand.
     *
     * @param card The card to be discarded.
     */
    public void discardFromHand(Card card) {
        hand.remove(card);
        addCardToDiscard(card);
    }

    /**
     * Gets the player's hand.
     *
     * @return The list of cards in the player's hand.
     */
    public List<Card> getHand() {
        return new ArrayList<>(hand);
    }

    /**
     * Gets the size of the draw pile.
     *
     * @return The number of cards in the draw pile.
     */
    public int getDrawPileSize() {
        return drawPile.size();
    }

    /**
     * Gets the size of the discard pile.
     *
     * @return The number of cards in the discard pile.
     */
    public int getDiscardPileSize() {
        return discardPile.size();
    }

    /**
     * Checks if the deck (draw pile and discard pile) is empty.
     *
     * @return True if both the draw pile and discard pile are empty, false otherwise.
     */
    public boolean isDeckEmpty() {
        return drawPile.isEmpty() && discardPile.isEmpty();
    }

    /**
     * Moves all cards from the hand to the discard pile.
     */
    public void discardHand() {
        discardPile.addAll(hand);
        hand.clear();
    }
}