package com.capgi.paymentwallet.dao;

import java.util.HashMap;

import com.capgi.paymentwallet.bean.Account;
import com.capgi.paymentwallet.bean.Customer;


public class PaymentWalletDao implements IPaymentWalletDao {
	static HashMap<String, Customer> map = new HashMap<String, Customer>();
	static HashMap<String, Account> map1 = new HashMap<String, Account>();

	
	Customer wallet = new Customer();
	static Customer acc;
	 Account acc1 = new Account();

	@Override
	public boolean loginAccount(String userName, String password) {
		// TODO Auto-generated method stub
		for(String key : map.keySet())
		{
			acc=map.get(key);
			if(acc.getUserName().equals(userName) && acc.getPassword().equals(password))
			{
				return true;
			}
		}
		return false;
		
	}
	

	@Override
	public boolean addCustomerDetails(Customer wallet) {
		// TODO Auto-generated method stub
		map.put(wallet.getName(), wallet);
		map.put(wallet.getUserName(), wallet);
		map.put(wallet.getAdharNumber(), wallet);


		return true;
	}

	@Override
	public float showBalance() {
		// TODO Auto-generated method stub
		return acc1.getBalance();
	}

	@Override
	public boolean depositAmount(float amount) {
		// TODO Auto-generated method stub

        acc1.setBalance(acc1.getBalance()+amount);
		
		return true;
	}

	@Override
	public boolean withdrawAmount(float amount) {
		// TODO Auto-generated method stub
		
		if(acc1.getBalance() >= (amount+500))
		{
			acc1.setBalance(acc1.getBalance()-amount);
			return true;
		}
		else
		{
			System.out.println("Minimum balance should be maintained");
		}
		return false;
	}

	@Override
	public boolean fundTransfer(int accountNumber, float amount) {
		// TODO Auto-generated method stub
		Customer ac = new Customer();
		Account ac1 = new Account();
		for(String key : map.keySet())
		{
			ac = map.get(key);
		    ac1 = map1.get(key);
			if(ac1.getAccountNumber()==accountNumber)
			{
				ac1.setBalance(ac1.getBalance()+amount);
				acc1.setBalance(acc1.getBalance()-amount);
				return true;
			}
		}
		return false;
	}

	@Override
	public void printTransaction() {
		// TODO Auto-generated method stub
		System.out.println(acc1);


		
	}
}
	