package com.capgi.paymentwallet.service;

public class PaymentWalletValidate {

	public boolean validateadharNumber(String adharNumber) {
		// TODO Auto-generated method stub
		if(adharNumber.length()==12)
		{
			return true;
		}
		else {
			return false;
		}
	}

	public boolean validatephoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		if(phoneNumber.length()==10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean validateinitBal(float initBal) {
		// TODO Auto-generated method stub
		if(initBal >=500)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public boolean validateuserName(String userName)
	{
		return true;
		
	}
	
	public boolean validatepassword(String password)
	{
		return true;
		
	}
	

	

}	