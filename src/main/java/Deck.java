import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();

    }

    public int numberOfCards() {
        return this.cards.size();
    }

    public void populate() {
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();
        for (Suit suit: suits){
            for (Rank rank: ranks){
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }
}
