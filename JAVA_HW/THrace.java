//Copyright @ U0324017_rightleft. All rights reserved
import java.util.*;
public class THrace {
	public static int posT=1,posH=1; // Tortoise, and Hare's position start at 1
	public static void main(String args[]){
		boolean racing=true;
		int movetypeT,movetypeH; // Tortoise, and Hare's move type
		System.out.println("BANG!!!!!");
		System.out.println("AND THEY'RE OFF!!!!!");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Start                                                                End");
		while(racing){
			if(posT>=70 || posH>=70) // one of them wins
			{
				if(posT>=70) // TORTOISE WIN
				{
					System.out.println("TORTOISE WINS!!! YAEH!!!");
					racing=false;
					break;
				}
				else if(posT==posH) // tie
				{
					System.out.println("It's a tie.");
					racing=false;
					break;
				}
				else // HARE WIN
				{					
					System.out.println("Hare wins. Yuch.");
					racing=false;
					break;
				}
			}			
			if(posT<0) // if they slip too much, the most is back to the start line
			{
				posT = 1;
				continue;
			}
			else if(posH<0)
			{
				posH = 1;
				continue;
			}			
			movetypeT = (int)(Math.random()*10+1);
			//System.out.println(movetypeT);
			movetypeH = (int)(Math.random()*10+1);
			//System.out.println(movetypeH);
			MoveType_T(movetypeT);
			MoveType_H(movetypeH);			
			if(posT<posH) // print the position
				print_THposition(posT,posH);
			else  // posT > posH
				print_HTposition(posH,posT);			
			if(posT==posH) // Tortoise bites Hare
				System.out.println("OUCH!!!");			
		}
	}
	public static void MoveType_T(int movetypeT) 		    // Tortoise move
	{
		if(movetypeT>=1 || movetypeT<=5) 	    // "Fast plod"
			posT += 3; 						    // 3 squares to the right
		else if(movetypeT==6 || movetypeT==7)   // "Slip"
			posT -= 6; 						    // 6 squares to the left
		else 								    // "Slow plod"
			posT += 1; 						    // 1 squares to the left			
	}
	public static void MoveType_H(int movetypeH) 			// Hare move
	{
		if(movetypeH==1 || movetypeH==2) 		// "Sleep"
			{} 									// No move
		else if(movetypeH==3 || movetypeH==4)   // "Big hop"
			posH += 9; 							// 9 squares to the right
		else if(movetypeH==5)					// "Big slip"
			posH -= 12; 						// 12 squares to the left
		else if(movetypeH>=6 || movetypeH<=8)	// "Small hop"
			posH += 1; 							// 1 squares to the right
		else									// "Small slip"
			posH -= 2; 							// 2 squares to the left			
	}
	public static void print_THposition(int posA,int posB) // if Tortoise behind Hare
	{
		System.out.print("|");
		for(int i=1; i<posA; ++i)
			System.out.print(" ");
		System.out.print("T");
		for(int i=posA+1; i<posB; ++i)
			System.out.print(" ");
		System.out.print("H");
		System.out.println("");
	}
	public static void print_HTposition(int posA,int posB) // if Hare behind Tortoise
	{
		System.out.print("|");
		for(int i=1; i<posA; ++i)
			System.out.print(" ");
		System.out.print("H");
		for(int i=posA+1; i<posB; ++i)
			System.out.print(" ");
		System.out.print("T");
		System.out.println("");
	}
}