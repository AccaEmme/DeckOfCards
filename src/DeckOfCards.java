import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DeckOfCards {
	/*
	  enum Figures {
		    DENARI,
		    SPADE,
		    COPPE,
		    BASTONI
		  }
	  */
	/*
	enum FrenchDeck {
		Figures("a", "b"),
		Values(1,2,3,4,5,6)
	}
	*/
	enum Figure {
		sp
	}
	
	public DeckOfCards() {
		for(int i=1; i<=10; i++) cards.add(new Card("DENARI", i));
		for(int i=1; i<=10; i++) cards.add(new Card("BASTONI", i));
		for(int i=1; i<=10; i++) cards.add(new Card("SPADE", i));
		for(int i=1; i<=10; i++) cards.add(new Card("COPPE", i));
		//System.out.println(Figures.BASTONI);
	}
	
	public DeckOfCards(ArrayList<Card> givenCardsDeck) {
		this.cards=givenCardsDeck;
	}
	
	public void printDeck() {
		for(Card c:cards) System.out.println(c.toString());
	}
	
	public void shuffleDeck() {
		Collections.shuffle( cards, new Random() );
	}
	
	private ArrayList<Card> cards = new ArrayList<Card>();
}
