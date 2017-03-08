public class Card {
	//test
	
	// this card's attributes
	private Suit suit;
	private Rank rank;
	private int value;
	
	//hello
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
		switch(rank) {
		case Ace:
			value = 1;
			break;
		case Two:
			value = 2;
			break;
		case Three:
			value = 3;
			break;
		case Four:
			value = 4;
			break;
		case Five:
			value = 5;
			break;
		case Six:
			value = 6;
			break;
		case Seven:
			value = 7;
			break;
		case Eight:
			value = 8;
			break;
		case Nine:
			value = 9;
			break;
		default:
			value = 10;
			break;
		}
		
	}
	//hello
	public Rank getRank() { 
		return rank;
	}
	
	public Suit getSuit() { 
		return suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public String toString() {
		return rank + " of " + suit + "s, value " + value;
	}

}
