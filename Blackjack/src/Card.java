public class Card {
	
	// this card's attributes
	private Suit suit;
	private Rank rank;
	
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toString() {
		return rank + " of " + suit + "s";
	}

}
