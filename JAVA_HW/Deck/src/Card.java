public class Card {
	private String face;
	private String suit;
	
	public Card(String cardface, String cardsuit)
	{
		face = cardface;
		suit = cardsuit;
	}	
	public String toString()
	{
		return suit+face;
	}
}
