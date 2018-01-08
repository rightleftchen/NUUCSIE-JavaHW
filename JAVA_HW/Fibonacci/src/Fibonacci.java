// Copyright @ U0324017_rightleft. All rights reserved
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("a)-----------------------------------");
		System.out.print("  Enter the nth Fibonacci number:");
		int input_number = input.nextInt();
		System.out.println("  The "+input_number+"th Fibonacci number: "+fibonacci(input_number));
		
		//-------------------------------------------------------------
		//The largest Fibonacci number can display on my system is "57"
		//-------------------------------------------------------------
		System.out.println("b)-----------------------------------");
		//System.out.println("  The largest(57th) Fibonacci number:"+fibonacci(57));
		
		System.out.println("c)-----------------------------------");
		System.out.println("----PART(a)--------------------------");
		System.out.print("      Enter the nth Fibonacci number:");
		double input_number2 = input.nextInt();
		System.out.println("      The "+(int)input_number2+"th Fibonacci number: "+fibonacci_double(input_number2));
		
		//-------------------------------------------------------------
		//The largest Fibonacci number(double) can display on my system is "50"
		//-------------------------------------------------------------
		System.out.println("----PART(b)--------------------------");
		System.out.print("      The largest(50th) Fibonacci number:"+fibonacci_double(50));
		
		
	}
	public static long fibonacci(int number)
	{
		if(number==1 || number==2) return 1;
		else
			return fibonacci(number-1)+fibonacci(number-2);
	}
	public static long fibonacci_double(double number)
	{
		if(number==1 || number==2) return 1;
		else
			return fibonacci_double(number-1)+fibonacci_double(number-2);
	}

}

