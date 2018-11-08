public class Pack extends CardPile {
    CardPile thePack = new CardPile();

    public Pack() {
        for (int suit = 1; suit <= 4; suit ++) {
            for (int value = 1; value <= 13; value++) {
                Card card = new Card(suit, value);
                thePack.putDown(card);
            }
        }
        System.out.println("Instantiated pack of size: " + thePack.getPileSize());
    }
}