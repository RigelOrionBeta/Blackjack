
public class Main {

	public static void main(String[] args) {
		Card card1 = new Card(Rank.Ace, Suit.Spade);
		System.out.println( card1 );
		System.out.println();
		Deck deck = new Deck();
		System.out.println(deck);

	}

}
