public class Card {
	private String rank;
	private String suit;

	public Card(int cardRank, int cardSuit){
		switch(cardRank){
				case 1:
					rank = "Ace";
					break;
				case 11:
					rank = "Jack";
					break;
				case 12:
					rank = "Queen";
					break;
				case 13:
					rank = "King";
					break;
				default:
					rank = String.valueOf(cardRank);
			}

		switch(cardSuit){
			case 0:
				suit = "Hearts";
				break;
			case 1:
				suit = "Diamonds";
				break;
			case 2:
				suit = "Clubs";
				break;
			case 3:
				suit = "Spades";
				break;
		}
	}

	public String getValue(){
		return rank + " of " + suit;
	}
}