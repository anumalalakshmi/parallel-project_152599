package com.capgi.paymentwallet.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgi.paymentwallet.service.PaymentWalletValidate;

public class PaymentWalletValidateTest {
	PaymentWalletValidate validate = new PaymentWalletValidate();

	@Test
	public void testValidateadharNumber() {
		assertEquals("Result",true,validate.validateadharNumber("343693783763"));

	}

	@Test
	public void testValidatephoneNumber() {
		assertEquals("Result",true,validate.validatephoneNumber("9666441554"));

	}

	@Test
	public void testValidateuserName() {
		assertEquals("Result",true,validate.validateuserName("Lakshmi"));

	}

	@Test
	public void testValidatepassword() {
		assertEquals("Result",true,validate.validatepassword("Anitha@7"));

	}

}
