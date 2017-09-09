//********************************************************************
//  Account.java       Author: Lewis/Loftus
//
//  Represents a bank account with basic services such as deposit
//  and withdraw.
//********************************************************************

import java.text.NumberFormat;

public class Account {
	private long acctNumber;
	private double balance;
	private String name;

	private double interestRate;
	private double minimumBalance;

	//----------------------------------------------------------------
	// Sets up the account by defining its owner, account number,
	// and initial balance.
	//----------------------------------------------------------------
	public Account (String owner, long account, double initial, double interest, double minBalance) {
		name = owner;
		acctNumber = account;
		balance = initial;
		interestRate = interest;
		minimumBalance = minBalance;
	}

	public Account (String owner, long account, double initial, double interest) {
		name = owner;
		acctNumber = account;
		balance = initial;
		interestRate = interest;
		minimumBalance = 0;
	}

	public Account(String owner, long account, double interest) {
		name = owner;
		acctNumber = account;
		balance = 0;
		interestRate = interest;
		minimumBalance = 0;
	}

	//----------------------------------------------------------------
	//  Deposits the specified amount into the account. Returns the
    //  new balance.
    //----------------------------------------------------------------
	public double deposit (double amount) {
		balance = balance + amount;
		return balance;
	}

    //----------------------------------------------------------------
    //  Withdraws the specified amount from the account and applies
    //  the fee. Returns the new balance.
    //----------------------------------------------------------------
	public double withdraw (double amount, double fee) {
		if((balance - amount - fee) < minimumBalance){
			System.out.println("Withdrawal unsuccessful: Insufficient funds");
		}
		else {
			balance = balance - amount - fee;
		}
		return balance;
	}

	//----------------------------------------------------------------
	//  Withdraw with no fee
	//----------------------------------------------------------------
	public double withdraw (double amount)   {
		if((balance - amount) < minimumBalance){
			System.out.println("Withdrawal unsuccessful: Insufficient funds");
		}
		else {
			balance = balance - amount;
		}
		return balance;
	}

	public double addInterest(){
		balance += (balance * interestRate);
		return balance;
	}

    //----------------------------------------------------------------
    //  Returns the current balance of the account.
    //----------------------------------------------------------------
    public double getBalance () {
    	return balance;
    }

    public long getAccountNumber () {
    	return acctNumber;
    }

    //----------------------------------------------------------------
    //  Returns a one-line description of the account as a string.
    //----------------------------------------------------------------
    public String toString () {
    	NumberFormat fmt = NumberFormat.getCurrencyInstance();
    	return acctNumber + "\t" + name + "\t" + fmt.format(balance);
    }
}