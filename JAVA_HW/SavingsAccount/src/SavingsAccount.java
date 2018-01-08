//Copyright @ U0324017_rightleft. All rights reserved
public class SavingsAccount {
	public static double annualInterestRate=0;
	private double savingBalance=0;
	
	public SavingsAccount(double savingBalance, double annualInterestRate)
	{
		this.savingBalance = savingBalance;
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getBalance() // get the balance
	{
		return savingBalance;
	}
	
	public void caculateMonthlyInterest() 
	{
		savingBalance = savingBalance + ((savingBalance*annualInterestRate)/12);
	}
	
	public void modifyInterestRate(double newRate) // new interest rate
	{
		annualInterestRate = newRate;
	}


}
