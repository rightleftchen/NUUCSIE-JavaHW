
public class Test {

	public static void main(String[] args) {
		
		DeckOfCards Deck = new DeckOfCards();
		Deck.shuffle();
		
		for(int i=1; i<=52; i++)
		{
			if(i==1)
			{
				System.out.print("East : ");
			}
			else if(i==14)
			{
				System.out.print("North: ");
			}
			else if(i==27)
			{
				System.out.print("West : ");
			}
			else if(i==40)
			{
				System.out.print("South: ");
			}
			System.out.printf("%s",Deck.dealCard());
			System.out.print(" ");
			if(i%13==0)
				System.out.println();
		}
	}
}
