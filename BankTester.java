public class BankTester {

	public static void main(String[] args){

	Bank lAndL = new Bank("L&L Bank", 0.03, 2, 100);

	Account account1 = lAndL.addAccount("John Smith", 2643305735L, 1000);
	Account account2 = lAndL.addAccount("Mary Sue", 395705425L);
	Account account3 = lAndL.addAccount("Mary Sue", 395705425L);


	lAndL.addInterest();

	account1.addInterest();
	account2.withdraw(234);




	System.out.println(lAndL.toString());

	}

}