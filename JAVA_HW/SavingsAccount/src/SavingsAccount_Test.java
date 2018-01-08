//Copyright @ U0324017_rightleft. All rights reserved
public class SavingsAccount_Test {

	public static void main(String[] args) {
		
		SavingsAccount saverA = new SavingsAccount(2000,0.04);
		SavingsAccount saverB = new SavingsAccount(3000,0.04);
		System.out.println("(Rate=0.04)");
		
		saverA.caculateMonthlyInterest();
		System.out.println("Saver1 balance: "+saverA.getBalance()); // show saverA balance
		
		saverB.caculateMonthlyInterest();
		System.out.println("Saver2 balance: "+saverB.getBalance()); // show the balance
		
		System.out.println("(Rate=0.05)");
		
		saverA.modifyInterestRate(0.05); // set new rate=0.05
		saverA.caculateMonthlyInterest();
		System.out.println("Saver1 balance: "+saverA.getBalance()); // show saverA balance
		
		saverB.modifyInterestRate(0.05); // set new rate=0.05
		saverB.caculateMonthlyInterest();
		System.out.println("Saver2 balance: "+saverB.getBalance());

	}

}
