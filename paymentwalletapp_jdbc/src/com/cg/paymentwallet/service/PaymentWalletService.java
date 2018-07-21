package com.cg.paymentwallet.service;

import com.cg.paymentwallet.bean.Account;
import com.cg.paymentwallet.dao.PaymentWalletDao;

public class PaymentWalletService implements IPaymentWalletService {
	PaymentWalletDao dao = new PaymentWalletDao();

	@Override
	public boolean loginAccount(String userName, String password) {
		// TODO Auto-generated method stub
		return dao.loginAccount(userName, password);
	}

	@Override
	public boolean addCustomerDetails(Account account) {
		// TODO Auto-generated method stub
		return dao.addCustomerDetails(account);
	}

	@Override
	public float showBalance() {
		// TODO Auto-generated method stub
		return dao.showBalance();
	}

	@Override
	public boolean depositAmount(float amount) {
		// TODO Auto-generated method stub
		return dao.depositAmount(amount);
	}

	@Override
	public boolean withdrawAmount(float amount) {
		// TODO Auto-generated method stub
		return dao.withdrawAmount(amount);
	}

	@Override
	public boolean fundTransfer(int accountNumber2, float amount) {
		// TODO Auto-generated method stub
		return dao.fundTransfer(accountNumber2,amount);
	}

	@Override
	public void printTransaction() {
		// TODO Auto-generated method stub
		dao.printTransaction();
		
	}

}
