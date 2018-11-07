public class Cards {
    public class Card {
        private int suitNumber;
        private int valueNumber;

        public Card(int suit, int value) {
            suitNumber = suit;
            valueNumber = value;
        }
    }

    // A card pile is a simple object that keeps track of a pile of Card objects.
    // It provides methods to add and remove Cards to/from the top of the pile.
    // It also provides methods that return a card from the pile given its index in the pile.
    public class CardPile {
        private Card[] pile;

        public CardPile() {
            pile = new Card[0];
        }

        public void putDown(Card card) {
            Card[] tempPile = new Card[(pile.length + 1)];
            for (int cardIndex = 0; cardIndex < pile.length; cardIndex++) {
                tempPile[cardIndex] = pile[cardIndex];
            }
            tempPile[(pile.length + 1)] = card;
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
            for (int cardIndex = 0; cardIndex < (pile.length - 1); cardIndex++) {
                tempPile[cardIndex] = pile[cardIndex];
            }
            pile = tempPile;
            return returnCard;
        }

        // Return how many cards are in the pile.
        public int getPileSize() {
            return pile.length;
        }
    }

    public class Pack {
        CardPile thePack = new CardPile();

        public Pack() {
            for (int suit = 1; suit <= 4; suit ++) {
                for (int value = 1; value <= 13; value++) {
                    Card card = new Card(suit, value);
                    thePack.putDown(card);
                }
            }
        }

        public void shuffle() {
            CardPile tempPack = new CardPile();
        }
    }
}