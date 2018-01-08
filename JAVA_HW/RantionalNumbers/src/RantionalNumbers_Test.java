// Copyright @ U0324017_rightleft. All rights reserved
public class RantionalNumbers_Test {

	public static void main(String[] args) {
		Rational num1 = new Rational(2,5);
		Rational num2 = new Rational(9,27);
		System.out.println("Rational number(1):"+num1.display(num1.getNumerator(),num1.getDenominator()));
		System.out.println("Rational number(2):"+num2.display(num2.getNumerator(),num2.getDenominator()));
		
		System.out.println("Addtion:"+num2.addition(num1.getNumerator(),num1.getDenominator(),num2.getNumerator(),num2.getDenominator()));
		System.out.println("Substraction:"+num2.subtract(num1.getNumerator(),num1.getDenominator(),num2.getNumerator(),num2.getDenominator()));
		System.out.println("Multiplication:"+num2.multiply(num1.getNumerator(),num1.getDenominator(),num2.getNumerator(),num2.getDenominator()));
		System.out.println("Division:"+num2.divide(num1.getNumerator(),num1.getDenominator(),num2.getNumerator(),num2.getDenominator()));		
		
		System.out.println("---float---");
		System.out.println("Rational number(1):"+num1.display_float(num1.getNumerator(),num1.getDenominator()));
		System.out.println("Rational number(2):"+num2.display_float(num2.getNumerator(),num2.getDenominator()));
		
	}

}
