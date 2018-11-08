import java.util.Arrays;
import java.util.Collections;

// A CardPile is a simple object that keeps track of a pile of Card objects.
// It provides methods to add and remove Card objects to/from the top of the pile.
// It also provides methods that return a card from the pile given its index in the pile.
public class CardPile {
    private Card[] pile;

    public CardPile() {
        pile = new Card[0];
    }

    public void putDown(Card card) {
        Card[] tempPile = new Card[(pile.length + 1)];
        System.arraycopy(pile, 0, tempPile, 0, (pile.length));
        tempPile[pile.length] = card;
        pile = tempPile;
    }

    // 'Puts a card on top of the pile'. Sets the pile equal to to pile appended with a supplied Card object.
    public void putDownPile(Card[] cards) {
        Card[] tempPile = new Card[(pile.length + cards.length)];
        for (int cardIndex = 0; cardIndex < tempPile.length; cardIndex++) {
            if (cardIndex < pile.length) {
                tempPile[cardIndex] = pile[cardIndex];
            } else {
                tempPile[cardIndex] = cards[(cardIndex - pile.length)];
            }
        }
    }

    // 'Picks up a card from the top of the pile'. Set the pile equal to the pile minus the top card,
    // and return the top card.
    public Card pickUp() {
        Card returnCard = pile[(pile.length - 1)];
        Card[] tempPile = new Card[(pile.length - 1)];
        System.arraycopy(pile, 0, tempPile, 0, (pile.length-1));
        pile = tempPile;
        return returnCard;
    }

    // Return how many cards are in the pile.
    public int getPileSize() {
        return pile.length;
    }

    public void shuffle() {
        Collections.shuffle(Arrays.asList(pile));
    }

    public String[] listCards() {
        String[] tempPile = new String[pile.length];
        for (int cardIndex = 0; cardIndex < pile.length; cardIndex++) {
            System.out.println(Integer.toString(cardIndex)+ pile[cardIndex]);
            tempPile[cardIndex] = pile[cardIndex].getCardCode();
        }
        return tempPile;
    }
}