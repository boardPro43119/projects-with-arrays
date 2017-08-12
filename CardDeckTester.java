public class CardDeckTester {
	public static void main(String[] args){
		DeckOfCards cardDeck = new DeckOfCards();

		System.out.println(cardDeck.deal(5));
		System.out.println(cardDeck.cardsRemaining());
		cardDeck.shuffle();
		System.out.println(cardDeck.cardsRemaining());
		cardDeck.deal(42);
		System.out.println(cardDeck.cardsRemaining());
		System.out.println(cardDeck.deal(12));
		System.out.println(cardDeck.deal(5));
	}
}