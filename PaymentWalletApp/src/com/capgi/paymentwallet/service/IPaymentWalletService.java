package com.capgi.paymentwallet.service;

import com.capgi.paymentwallet.bean.Customer;

public interface IPaymentWalletService {
	public boolean loginAccount(String userName,String password);
    public boolean addCustomerDetails(Customer wallet);
	public float showBalance();
	public boolean depositAmount(float amount);
	public boolean withdrawAmount(float amount);
	public boolean fundTransfer(int accountNumber,float amount);
	public void printTransaction();

}
	
	


