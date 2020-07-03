package com.java.learn.sp;

public class BankAccount {

	long Account_Number = 223145l;
	String Acc_holder_name = "Sita";
	float Account_Balance = 5000;

	public void BankBalance() {
		System.out.println("Balance in the account: " + Account_Balance);
	}

	public static void main(String[] args) {

		BankAccount account = new BankAccount();
		account.BankBalance();

	}

}
