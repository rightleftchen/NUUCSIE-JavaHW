// Copyright @ U0324017_rightleft. All rights reserved
import java.util.*;
public class GCD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,num2,temp=0;
		System.out.println("Enter two numbers: ");
		System.out.print("Num1 = ");
		num1 = input.nextInt();
		System.out.print("Num2 = ");
		num2 = input.nextInt();		
		while(num1%num2!=0) // Euclidean_algorithm
		{
			temp=num2;
			num2=num1%num2;
			num1=temp;
		}
		System.out.println("GCD = "+num2);
	}
}
