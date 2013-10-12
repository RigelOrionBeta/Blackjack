import java.util.ArrayList;
import java.util.Random;

public class Deck {

	ArrayList<Card> deck = new ArrayList<Card>();
	
	/* Constructor
	 * 	Creates an unshuffled deck of cards with all combinations of suits and ranks
	 */
	public Deck() {
		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();
		for(int s = 0; s < suits.length; s++) {
			for(int r = 0; r < ranks.length; r++) {
				deck.add( new Card(ranks[r], suits[s]));
			}
		}
		shuffle();
	}
	//hello
	public void shuffle() {
		ArrayList<Card> nextdeck = new ArrayList<Card>();
		Random gen = new Random();
		while(deck.size() != 0) {
			int randomCard = gen.nextInt(deck.size());
			Card temp = deck.get(randomCard);
			nextdeck.add(temp);
			deck.remove(randomCard);
		}
		deck = nextdeck;
	}
	
	/* draw()
	 *  returns top card and removes it from deck
	 */
	public Card draw() {
		if(!empty()) {
			Card card = deck.get(0);
			deck.remove(0);
			return card;
		} else {
			return null;
		}
	}

	/* size()
	 *  returns current size of the deck
	 */
	public int size() {
		return deck.size();
	}
	
	public boolean empty() {
		return deck.size() == 0;
	}
	
	/* toString()
	 * 
	 * return - returns a string representing what's in the deck currently.
	 */
	public String toString() {
		String returnval = "";
		for(int i = 0; i < deck.size(); i++) {
			returnval = returnval + deck.get(i).toString() + "\n";
		}
		return returnval;
	}
	
}
