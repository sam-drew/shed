import java.util.HashMap;
import java.util.Map;

// A Card object has a suit and value, defining which card it is.
// Must be a member of a 4 suit 13 value card deck.
public class Card {
    private Map<Integer, String> suitsMap = new HashMap<>();
    private Map<Integer, String> valuesMap = new HashMap<>();
    private int suitNumber;
    private int valueNumber;
    private String cardCode;

    public Card(int suit, int value) {
        // Initialise the maps for getting the string value & suit of a card.
        suitsMap.put(1, "Diamonds");
        suitsMap.put(2, "Hearts");
        suitsMap.put(3, "Clubs");
        suitsMap.put(4, "Spades");
        valuesMap.put(1, "Ace");
        for (int valueIndex = 2; valueIndex < 11; valueIndex++) {
            valuesMap.put(valueIndex, Integer.toString(valueIndex));
        }
        valuesMap.put(11, "Jack");
        valuesMap.put(12, "Queen");
        valuesMap.put(13, "King");

        // Set the suit and value numbers given the parameters supplied to the constructor.
        suitNumber = suit;
        valueNumber = value;
        if ((valuesMap.get(valueNumber)).length() < 3) {
            cardCode = (valuesMap.get(valueNumber) + suitsMap.get(suitNumber).substring(0, 1));
        } else {
            cardCode = ((valuesMap.get(valueNumber).substring(0, 1)) + suitsMap.get(suitNumber).substring(0, 1));
        }
    }

    public String getCardCode() {
        return cardCode;
    }

    public int getSuitNumber() {
        return suitNumber;
    }

    public int getValueNumber() {
        return valueNumber;
    }
}
