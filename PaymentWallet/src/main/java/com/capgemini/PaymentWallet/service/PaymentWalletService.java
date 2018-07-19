package com.capgemini.PaymentWallet.service;

import com.capgemini.PaymentWallet.bean.BankWallet;
import com.capgemini.PaymentWallet.dao.PaymentWalletDao;

public class PaymentWalletService implements IPaymentWalletService{
	PaymentWalletDao dao = new PaymentWalletDao();

	public boolean addBankWalletDetails(BankWallet wallet) {
		// TODO Auto-generated method stub
		return dao.addBankWalletDetails(wallet);
	}

	public BankWallet deposit(String phoneNumber, double amount) {
		// TODO Auto-generated method stub
		return dao.deposit(phoneNumber, amount);
	}

	public BankWallet withdraw(String phoneNumber, double amount) {
		// TODO Auto-generated method stub
		return dao.withdraw(phoneNumber, amount);
	}

	public double showBalance(double amount) {
		// TODO Auto-generated method stub
		return dao.showBalance(amount);
	}

	public boolean transferMoney(double amopunt) {
		// TODO Auto-generated method stub
		
		return false;
	}

}
