import java.util.ArrayList;

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
	}
	//hello
	public void shuffle() {
		
	}
	
	/* draw()
	 *  returns top card and removes it from deck
	 */
	public Card draw() {
		Card card = deck.get(0);
		deck.remove(0);
		return card;
	}
	
	/* size()
	 *  returns current size of the deck
	 */
	public int size() {
		return deck.size();
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
