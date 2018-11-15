import java.util.ArrayList;

public class Game {

    private Dealer dealer;
    private Deck deck;
    private ArrayList<Player> players;

    public Game(ArrayList<Player> players) {
        this.players = players;
        this.deck = new Deck();

    }

    public Player playGame() {

        this.deck.populate();
        this.deck.shuffleCards();
        this.dealer = new Dealer(this.deck);
        for (Player player: this.players){
           Card dealtCard = dealer.dealCard();
           player.addCard(dealtCard);
        }
        Player winner = this.players.get(0);
            for (Player player: this.players){
                if (player.getTotal() > winner.getTotal()){
                    winner = player;
                }
            }

        return winner;

    }
}
