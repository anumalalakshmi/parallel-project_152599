package com.capgemini.PaymentWallet.bean;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class BankWalletTest extends TestCase {
    @Test
	public void testGetName() {
		assertEquals("king", "king");
		assertNotEquals("king", "123");
		assertNotEquals("king", "abc123");
		assertSame("king", "king");
		}

	@Test
	public void testGetAdharNumber() {
		assertEquals("343693783763", "343693783763");
		assertNotEquals("343693783763", "abc");
		assertNotEquals("343693783763", "abc123");
		assertSame("343693783763", "343693783763");
}
   @Test
	public void testGetPhoneNumber() {
		assertEquals("9666441554", "9666441554");
		assertNotEquals("9666441554", "bcs");
		assertNotEquals("9666441554", "bcs123");
		assertSame("9666441554", "9666441554");
		}

	@Test
	public void testGetEmail() {
		assertEquals("abc@gmail.com", "abc@gmail.com");
		assertNotEquals("abc@gmail.com", "abc.com");
		assertNotEquals("abc@gmail.com", "abcgmail.com");
		assertSame("abc@gmail.com", "abc@gmail.com");
		assertNotEquals("abc@gmail.com", "0123456");
		}
    @Test
	public void testGetAge() {
		assertEquals(21, 21);
		assertNotEquals(21,"ab");
		assertNotEquals(21, 0);
		assertSame(21, 21);
		assertNotEquals(21,500);
		}
	 @Test
	public void testGetGender() {
		assertEquals("F", "F");
		assertNotEquals("F","ab");
		assertNotEquals("F", 0);
		assertSame("F", "F");
		assertNotEquals("F", 123);
		assertNotSame("F","a1");
		}
    @Test
	public void testGetBalance() {
		assertEquals(1000, 1000);
		assertNotEquals(1000,"ab");
		assertNotEquals(1000, 0);
		assertSame(1000, 1000);
		
		
	}

}
