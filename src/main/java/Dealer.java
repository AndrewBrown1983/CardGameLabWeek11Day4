public class Dealer {

    private Deck deck;

    public Dealer(Deck deck) {
        this.deck = deck;
    }

    public Card dealCard() {
        return deck.getFirstCard();
    }
}
