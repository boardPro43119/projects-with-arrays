import java.util.Random;
import java.util.ArrayList;

public class DeckOfCards {
	private Card[] deck; // Array of Card object
	private Random shuffler = new Random();
	private int cardsInDeck;

	public DeckOfCards(){
		shuffle(); // Shuffle the deck upon first creating it
	}

	public void shuffle(){
		int currentRank = 1; // Rank of next card
		int currentSuit = 0; // Suit of next card (0=H, 1=D, 2=C, 3=S)
		int currentPositionIndex; //
		int currentPosition;

		ArrayList positionsEmpty = new ArrayList(); //

		for(int i=0; i<52; i++){
			positionsEmpty.add(i);
		}

		int executions = 0; // debugging

		deck = new Card[52]; // Point deck variable to a new, empty array of Card objects
		cardsInDeck = 0;

		while(cardsInDeck<52){
			executions++; // debugging
			currentPositionIndex = shuffler.nextInt(52-cardsInDeck); // Choose a random spot in the deck, out of the remaining vacant spots, in which to place the next card
			currentPosition = (int)positionsEmpty.get(currentPositionIndex);

			deck[currentPosition] = new Card(currentRank, currentSuit); // Put the next card in this position
			positionsEmpty.remove(currentPositionIndex); // Remove this position from the remaining available ones
			currentRank++; // Deal all hearts first (A up to K), then diamonds, clubs, spades
			cardsInDeck++;
			if(currentRank>13){ // Begin a new suit
				currentRank = 1;
				currentSuit++;
			}

		}

		System.out.println(executions + " shuffle executions"); // debugging
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