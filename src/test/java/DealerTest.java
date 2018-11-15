import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Deck deck;
    Dealer dealer;

    @Before
    public void setUp(){
        deck = new Deck();
        deck.populate();
        deck.shuffleCards();
        dealer = new Dealer(deck);
    }

    @Test
    public void canDealCards() {
        Card dealtCard = dealer.dealCard();
        Card card = new Card(Suit.HEARTS, Rank.ACE);
        assertEquals(card.getClass(), dealtCard.getClass());
        assertEquals(51, deck.numberOfCards());
    }
}
