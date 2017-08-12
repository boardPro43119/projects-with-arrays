import java.util.Random;

public class DeckOfCards {
	public Card[] deck; // Array of Card object
	public Random shuffler = new Random();
	public int cardsInDeck;

	public DeckOfCards(){
		shuffle(); // Shuffle the deck upon first creating it
	}

	public void shuffle(){
		int currentRank = 1;
		int currentSuit = 0;
		int currentPosition;

		deck = new Card[52]; // Point deck variable to a new, empty array of Card objects
		cardsInDeck = 0;

		while(cardsInDeck<52){
			currentPosition = shuffler.nextInt(52); // Choose a random spot in the deck in which to place the next card

			if(deck[currentPosition] == null){
				deck[currentPosition] = new Card(currentRank, currentSuit); // Put the next card in this position only if it is vacant
				currentRank++; // Deal all hearts first (A up to K), then diamonds, clubs, spades
				cardsInDeck++;
				if(currentRank>13){ // Begin a new suit
					currentRank = 1;
					currentSuit++;
				}
			}
		}
	}

	public String deal(){
		String result = "";

		if(cardsInDeck==0){
			result+= "The deck is empty, reshuffle"; // If deck is empty, don't deal any cards and notify the user
		}
		else{
			result+=deck[cardsInDeck-1].getValue() + "\n";
			cardsInDeck--;
		}

		return result;
	}

	public String deal(int numCards){
		String result = "";

		if(cardsInDeck==0){
			numCards = 0;
			result+= "The deck is empty, reshuffle"; // If deck is empty, don't deal any cards and notify the user
		}
		else if(numCards>cardsInDeck){
			numCards = cardsInDeck; // If user tries to deal more cards than there are cards left in the deck, only deal that many more cards
		}

		for(int i=0; i<numCards; i++){
			result+=deck[cardsInDeck-1].getValue() + "\n";
			cardsInDeck--;
		}

		return result;
	}

	public String cardsRemaining(){
		return cardsInDeck + " cards left in deck\n";
	}

}