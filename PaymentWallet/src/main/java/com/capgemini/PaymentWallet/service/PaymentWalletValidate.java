package com.capgemini.PaymentWallet.service;

public class PaymentWalletValidate {
	public boolean validatename(String name) {
		// TODO Auto-generated method stub
		if(name.equals("king"))  {
			return true;
		} else {
		
		return false;
	}
	}

	public boolean validateadharNumber(long adharNumber) {
		// TODO Auto-generated method stub
		if(adharNumber == 343693783 ) {
			return true;
		} else {
		return false;
	}
	}

	public boolean validatephoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		if(phoneNumber.length() == 10) {
			return true;
		} else {
		return false;
	}
	}
	public boolean validateemail(String email) {
		// TODO Auto-generated method stub
		if(email.equals("abc@gmail.com")) {
			return true;
		} else {
		return false;
	}
	}

	public boolean validateage(int age) {
		// TODO Auto-generated method stub
		if(age >=1  && age <=100) {
			return true;
		} else {
		return false;
	}
	}

	public boolean validategender(String gender) {
		// TODO Auto-generated method stub
		if(gender.length() == 1) {
			return true;
		} else {
		return false;
	}
	}


}
