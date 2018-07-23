package com.cg.paymentwallet.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaymentWalletValidateTest {

	@Test
	public void testValidatename() {
		assertEquals("name", "name");
		assertNotEquals("name", 123);
		assertNotEquals("name", "abc123");
		assertSame("name", "name");
		assertNotSame("name", "123ad");
	}

	@Test
	public void testValidateadharNumber() {
		assertEquals(343693783, 343693783);
		assertNotEquals(343693783, "abc");
		assertNotEquals(343693783,"123abc");
		assertSame(343693783,1000);

	}

	@Test
	public void testValidatephoneNumber() {
		assertEquals("9666441554","9666441554");
		assertNotEquals("9666441554", "abc");
		assertNotEquals("9666441554","123abc");
		assertSame("9666441554",1000);
	}

	@Test
	public void testValidateemail() {
		assertEquals("abc@gmail.com", "abc@gmail.com");
		assertNotEquals("abc@gmail.com", "abc.com");
		assertNotEquals("abc@gmail.com", "abcgmail.com");
		assertNotEquals("abc@gmail.com", "0123456");
	}

	@Test
	public void testValidateage() {
		assertEquals(21, 21);
		assertNotEquals(21,"ab");
		assertNotEquals(21, 0);
		assertNotEquals(21,500);
	}

	@Test
	public void testValidategender() {
		assertEquals("F", "F");
		assertNotEquals("F","ab");
		assertNotEquals("F", 0);
		assertNotEquals("F", 123);
		assertNotSame("F","a1");
	}


}
