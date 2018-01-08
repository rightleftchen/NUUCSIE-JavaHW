import java.util.Scanner;

public class homework_2 {
	
	public static  void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("===   4.30   ===");
		int answer = 0;
		while(true){
			System.out.print("Enter five numbers : ");
			String sentence = input.nextLine();// create a method "sentence"  to store character		
			char[] fivenumber = sentence.toCharArray(); // change String to char array
			if ( fivenumber.length < 5 )  // if the number less than 5
			{
				System.out.println("========    Error!!!!!!!!!   ========"); // Enter again
				continue;
			}
			int counter_2=4; // right to left number index
			for(int counter=0; counter<2; ++counter)
			{
				if ( fivenumber[counter] == fivenumber[counter_2] ) // if left number equal to right number
					{ ++answer;	} // answer+1, if (answer == 2) it's palindrome
				--counter_2;
			}
			if (answer==2)
				{
					System.out.println("========    It's  palindrome.   ========");
					break;
				}
			else
			{
				System.out.println("========  It's not palindrome!!!!  ========");
				break;
			}
		}// end while
		
		System.out.println("===   4.31   ===");
		int operator=1,decimal=0,temp=0;
		System.out.print( "The binary : " );
		char[] binary = input.nextLine().toCharArray();
		for(int counter=binary.length-1; counter>=0; --counter)
		{
				temp = Character.getNumericValue(binary[counter]);// change '0'(char) to '0'( number) and store in "temp"
				temp *= operator; // e.g.  1*operator , 0*operator 
				decimal = decimal + temp; // accumulate the sum of decimal
				operator *= 2; // 1,2,4,8,16	
		}
		System.out.println( "The decimal = " + decimal );
		
		System.out.println("===   5.15 (a)  ===");
		for(int counter=1; counter<11; ++counter)  // line 1~10
		{
			for(int counter_2=0; counter_2<counter; ++counter_2)   // amount of star(*) in the line
			{
				System.out.print( "*" );  // print ( * )
			}
			System.out.println();//next line
		}// end graph (a)
		
		System.out.println("===   5.15 (b)  ===");
		for(int counter=1; counter<11; ++counter)  // line 1~10
		{
			for(int counter_2=10; counter_2>=counter; --counter_2)  // amount of star(*) in the line
			{
				System.out.print( "*" ); // print ( * )
			}
			System.out.println();//next line
		}// end graph (b)

		System.out.println("===   5.15 (c)  ===");
		for(int counter=1; counter<11; ++counter)  // line 1~10
		{
			for(int counter_2=1; counter_2<counter; ++counter_2) // amount of blank ("    ") in the line
			{
				System.out.print(" "); // print ( "   " )
			}
			for(int counter_2=10; counter_2>=counter; --counter_2)   // amount of star(*) in the line
			{
				System.out.print( "*" ); // print ( * )
			}
			System.out.println();//next line
		}// end graph (c)
		
		System.out.println("===   5.15 (d)  ===");
		for(int counter=1; counter<11; ++counter)  // line 1~10
		{
			for(int counter_2=9; counter_2>=counter; --counter_2) // amount of blank ("    ") in the line
			{
				System.out.print(" "); // print ( "   " )
			}
			for(int counter_2=0; counter_2<counter; ++counter_2)   // amount of star(*) in the line
			{
				System.out.print( "*" ); // print ( * )
			}
			System.out.println();//next line
		}// end graph (d)
		
		System.out.println("===     5.24   ===");
		for(int counter=1; counter<=5; ++counter)
		{
			for(int counter_4=5; counter_4>counter; --counter_4 )
			{
				System.out.print( " " ); // print (    )
			}
			for(int counter_2=1; counter_2<2*counter; ++counter_2 )
			{
				System.out.print( "*" ); // print ( * )
			}
			System.out.println();//next line
		}
		for(int counter_3=4; counter_3>0; --counter_3)
		{
			for(int counter_5=5; counter_5>counter_3; --counter_5 )
			{
				System.out.print( " " ); // print ( * )
			}
			for(int counter_6=(2*counter_3)-1; counter_6>0; --counter_6 )
			{
				System.out.print( "*" ); // print ( * )
			}
			System.out.println();//next line
		}
		
		System.out.println();
		System.out.println();
		System.out.println(" .................................Java homework _U0324017 ");
	}// end main
}
