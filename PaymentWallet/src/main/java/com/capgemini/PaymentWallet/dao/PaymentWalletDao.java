package com.capgemini.PaymentWallet.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.PaymentWallet.bean.BankWallet;

public class PaymentWalletDao implements IPaymentWalletDao {
  	static List<BankWallet> list = new ArrayList<BankWallet>();

	
	BankWallet wallet = new BankWallet();

	double balance;

	public boolean addBankWalletDetails(BankWallet wallet) {
		// TODO Auto-generated method stub
		return false;
	}

	public BankWallet deposit(String phoneNumber, double amount) {
		 balance += amount;
		 System.out.println("Your current balance is " +balance);
		return  null;
		// TODO Auto-generated method stub
		
	}

	public BankWallet withdraw(String phoneNumber, double amount) {
		// TODO Auto-generated method stub
		balance -= amount;
		System.out.println("your current balance is" +balance);
		return null;
	}

	public double showBalance(double amount) {
		// TODO Auto-generated method stub
		balance = amount;
		System.out.println("Your balance is " +balance);
		
		
		
		return balance;
	}

	public boolean transferMoney(double amopunt) {
		return false;
		// TODO Auto-generated method stub
		
	}
	
}
