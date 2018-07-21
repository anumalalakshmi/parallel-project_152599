package com.cg.paymentwallet.dao;

import com.cg.paymentwallet.bean.Account;

public interface IPaymentWalletDao {
	public boolean loginAccount(String userName,String password);
    public boolean addCustomerDetails(Account account);
	public float showBalance();
	public boolean depositAmount(float amount);
	public boolean withdrawAmount(float amount);
	public boolean fundTransfer(int accountNumber2, float amount);
	public void printTransaction();

	

}
