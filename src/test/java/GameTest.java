import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    ArrayList<Player> players;


    @Before
    public void setUp(){
        player1 = new Player("Andrew");
        player2 = new Player("Valentina");
        players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        game = new Game(players);
    }

    @Test
    public void canPlayGame() {
        Player winner = game.playGame();
        assertEquals(player1.getClass(), winner.getClass());
    }
}
