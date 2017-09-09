import java.util.ArrayList;
import java.text.NumberFormat;

public class Bank {

	private ArrayList<Account> accountList = new ArrayList<Account>();
	private int numAccounts = 0;

	private String name;
	private double interestRate;
	private int maxAccounts;
	private double minimumBalance;

	public Bank(String name, double interestRate, int maxAccounts, double minimumBalance){
		this.name = name;
		this.interestRate = interestRate;
		this.maxAccounts = maxAccounts;
		this.minimumBalance = minimumBalance;
	}

	public Account addAccount(String owner, long account, double initial){
		if(numAccounts == maxAccounts){
			System.out.println("Account cannot be created: Maximum number of accounts reached");
			return null;
		}
		else{
			Account newAccount = new Account(owner, account, initial, interestRate, minimumBalance);
			accountList.add(newAccount);
			numAccounts++;
			return newAccount;
		}
	}

	public Account addAccount(String owner, long account){
		if(numAccounts == maxAccounts){
			System.out.println("Account cannot be created: Maximum number of accounts reached");
			return null;
		}
		else{
			Account newAccount = new Account(owner, account, minimumBalance, interestRate, minimumBalance);
			accountList.add(newAccount);
			numAccounts++;
			return newAccount;
		}
	}

	public boolean removeAccount(Account account){
		boolean found = accountList.remove(account);
		if(!found){
			System.out.println("Account " + account + " does not exist");
		}
		else{
			numAccounts--;
		}
		return found;
	}

	public void addInterest(){
		for (Account acc : accountList) {
			acc.addInterest();
		}
	}

	public String toString(){
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		String result = "";

		result+=name + "\t" + "Minimum balance: " + fmt.format(minimumBalance) + "\n\n";
		for (Account acc : accountList) {
			result+=acc.toString() + "\n";
		}

		return result;

	}

}