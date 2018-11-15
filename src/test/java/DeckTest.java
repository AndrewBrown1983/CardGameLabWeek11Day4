import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void setUp(){
        deck = new Deck();
    }

    @Test
    public void canGetNumberOfCards() {
        assertEquals(0, deck.numberOfCards());
    }

    @Test
    public void canPopulateDeck() {
       deck.populate();
       assertEquals(52, deck.numberOfCards());
    }
}
