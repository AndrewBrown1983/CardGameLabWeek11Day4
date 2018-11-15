import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();

    }

    public Card getFirstCard() {
         Card card = this.cards.get(0);
         this.cards.remove(card);
         return card;

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

    public void shuffleCards() {
        Collections.shuffle(this.cards);
    }
}
