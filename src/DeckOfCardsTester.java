import java.util.ArrayList;

public class DeckOfCardsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckOfCards mazzonapoletano = new DeckOfCards();
		//mazzonapoletano.printDeck();
		
		//mazzonapoletano.shuffleDeck();
		//mazzonapoletano.printDeck();
		
		
		ArrayList<Card> cartefrancesi = new ArrayList<Card>();
		cartefrancesi.add(new Card("CUORI", "A"));
		for(int i=2; i<=10; i++) cartefrancesi.add(new Card("CUORI", i));
		DeckOfCards mazzofrancese = new DeckOfCards( cartefrancesi );
		mazzofrancese.shuffleDeck();
		mazzofrancese.printDeck();
	}

}
