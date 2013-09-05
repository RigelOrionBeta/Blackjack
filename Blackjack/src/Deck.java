import java.util.ArrayList;

public class Deck {

	ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck() {
		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();
		for(int s = 0; s < suits.length; s++) {
			for(int r = 0; r < ranks.length; r++) {
				deck.add( new Card(ranks[r], suits[s]));
			}
		}
	}
	
	public String toString() {
		String returnval = "";
		for(int i = 0; i < deck.size(); i++) {
			returnval = returnval + deck.get(i).toString() + "\n";
		}
		return returnval;
	}
	
}
