import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public int countCards() {
        return this.hand.size();
    }

    public void addCard(Card dealtCard) {
        this.hand.add(dealtCard);
    }

    public int getTotal(){
        int total =  0;
        for (Card card: this.hand){
            total += card.getValue();
        }
        return total;
    }
}
