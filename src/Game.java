
public class Game {
	
	private MainWindow mw;
	
	private Deck deck;
	
	private Human human;
	private Dealer dealer;
	
	int bob = 0;
	int steve = 0;

	public Game() {
		Card card1 = new Card(Rank.Ace, Suit.Spade);
		deck = new Deck();
	}
	
	public void setView(MainWindow mw) {
		this.mw = mw;
	}
	
	public void stand() {
		Card drawn;
		drawn = deck.draw();
		mw.setCard(1, bob, drawn);
		System.out.println("bob = " + bob);
		bob++;
	}
	public void hit() {
		Card drawn;
		drawn = deck.draw();
		mw.setCard(0, steve, drawn);
		System.out.println("steve = " + steve);
		steve++;
	}
	
}
