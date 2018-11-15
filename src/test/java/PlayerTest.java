import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void setUp(){
        player = new Player("Andrew");
    }

    @Test
    public void canCountCards() {
      assertEquals(0, player.countCards());
    }

    @Test
    public void canGetHandValue() {
        Card card = new Card(Suit.CLUBS, Rank.FIVE);
        player.addCard(card);
        player.addCard(card);
        assertEquals(10, player.getTotal());
    }
}
