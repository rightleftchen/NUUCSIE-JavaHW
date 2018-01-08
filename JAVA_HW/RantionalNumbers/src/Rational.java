// Copyright @ U0324017_rightleft. All rights reserved
public class Rational {	
	private int numerator;
	private int denominator;

	public Rational (int numerator,int denominator){
		// reduced form
		//find GCD
		int n,m;
		m=numerator; // m is GCD
		n=denominator;
		while(n!=0)
		{
			int r = m%n;
			m = n;
			n = r;
		}
		// reduced form
		numerator /= m;
		denominator /= m;
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public void no_argument()
	{
		this.numerator = 3;
		this.denominator = 6;
	}
	// part a)
	public static String addition(int numerator,int denominator,int numerator2,int denominator2)
	{
		// let denominator be the same
		numerator = numerator*denominator2+numerator2*denominator;
		denominator *= denominator2;
		//find GCD
		int n,m;
		m=numerator; // m is GCD
		n=denominator;
		while(n!=0)
		{
			int r = m%n;
			m = n;
			n = r;
		}
		// reduced form
		numerator /= m;
		denominator /= m;	
		return numerator+"/"+denominator;
	}
	// part b)
	public static String subtract(int numerator,int denominator,int numerator2,int denominator2)
	{
		// let denominator be the same
		numerator *= denominator2;
		numerator2 *= denominator;
		denominator *= denominator2;
		if(numerator<numerator2)
		{
			int temp=numerator;
			numerator = numerator2;
			numerator2 = temp;
		}
		numerator -= numerator2;		
		//find GCD
		int n,m;
		m=numerator; // m is GCD
		n=denominator;
		while(n!=0)
		{
			int r = m%n;
			m = n;
			n = r;
		}
		// reduced form
		numerator /= m;
		denominator /= m;	
		return numerator+"/"+denominator;
	}
	// part c)
	public static String multiply(int numerator,int denominator,int numerator2,int denominator2)
	{
		numerator *= numerator2;
		denominator *= denominator2;		
		//find GCD
		int n,m;
		m=numerator; // m is GCD
		n=denominator;
		while(n!=0)
		{
			int r = m%n;
			m = n;
			n = r;
		}
		// reduced form
		numerator /= m;
		denominator /= m;	
		return numerator+"/"+denominator;
	}
	//part d)
	public static String divide(int numerator,int denominator,int numerator2,int denominator2)
	{
		int temp=numerator2; // ­Ë¼Æ
		numerator2 = denominator2;
		denominator2 = temp;
		//¬Û­¼
		numerator *= numerator2;
		denominator *= denominator2;		
		//find GCD
		int n,m;
		m=numerator; // m is GCD
		n=denominator;
		while(n!=0)
		{
			int r = m%n;
			m = n;
			n = r;
		}
		// reduced form
		numerator /= m;
		denominator /= m;	
		return numerator+"/"+denominator;
	}
	// part e)
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}
	
	public static String display(int numerator,int denominator)
	{
		return numerator+"/"+denominator;
	}
	public static float display_float(int numerator,int denominator)
	{
		float num=0;
		numerator *= 100;
		num = numerator/denominator;
		num /= 100;		
		return num;
	}
	

}
