// Copyright @ U0324017_rightleft. All rights reserved
import java.util.*;
public class CAI {
	public static int num1,num2;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int answer=0;
		int correct;
		SecureRandom();
		correct = num1*num2;		
		while(true)
		{
			System.out.println("How much is "+num1+" times "+num2+" ?");
			System.out.print("Answer = ");
			answer = input.nextInt();
			if(answer==correct) // if answer is correct
			{
				System.out.println("Correct!");
				System.out.println();
				SecureRandom(); // generate new question
				continue;
			}
			else // if answer is wrong
			{
				System.out.println("NO. Please try again.");
				System.out.println();
				continue;
			}
		}
	}
	public static void SecureRandom()
	{
		num1=(int)(Math.random()*10+1);
		num2=(int)(Math.random()*10+1);
	}
}
