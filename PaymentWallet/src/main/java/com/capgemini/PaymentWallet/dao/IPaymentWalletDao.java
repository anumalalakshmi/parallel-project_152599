package com.capgemini.PaymentWallet.dao;

import com.capgemini.PaymentWallet.bean.BankWallet;

public interface IPaymentWalletDao {
	public  boolean addBankWalletDetails(BankWallet wallet);
	public BankWallet deposit(String phoneNumber, double amount);
	public BankWallet withdraw(String phoneNumber, double amount);
	public double showBalance(double amount);
	public boolean transferMoney(double amopunt);
	//public void printTransactions();


}
