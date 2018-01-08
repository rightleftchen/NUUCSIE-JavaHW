import java.util.*;
public class DeckOfCards {
	private static Card[] deck;
	private static int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	public DeckOfCards() {
		String[] face = { "A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] suit = { "C","D","H","S"};
		
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		for(int i=0; i<deck.length; i++)
		{
			deck[i] = new Card(face[i%13], suit[i/13]);
		}
	}
	
	public void shuffle()
	{
		currentCard = 0;
		for(int first=0; first<deck.length; first++)
		{
			int second = (int)(Math.random()*52);
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;			
		}// end for
	}// end shuffle
	
	public Card dealCard()
	{
		if(currentCard < deck.length) return deck[currentCard++];
		else return null;
	}

}
