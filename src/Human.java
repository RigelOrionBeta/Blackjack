import java.util.ArrayList;


public class Human {
	
	ArrayList<Card> hand;
	
	public Human() {
		hand = new ArrayList<Card>();
	}
	
	public void dealt(Card card) {
		hand.add(card);
	}
	
	public ArrayList<Card> getHand() {
		return hand;
	}
	
	

}
