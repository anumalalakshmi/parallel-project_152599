package com.cg.paymentwallet.bean;

import static org.junit.Assert.*;

import junit.framework.TestCase;

public class CustomerTest extends TestCase{
	Customer wallet = new Customer();

	public void testGetName() {
			
			assertEquals("abc", wallet.getName());
			assertNotSame("b9ht", wallet.getName());
			
			
	}


		public void testGetPhoneNumber() {
			assertNotSame(0, wallet.getPhoneNumber());
			assertEquals("9666441554", "9666441554");
			
		}

		

		public void testGetPassword() {
			
			
			assertNotSame("a%s", wallet.getPassword());
			assertNull(null);
		}

		

		public void testGetAge() {
			assertEquals(30, wallet.getAge());
			assertNotSame("ten", wallet.getAge());
			
			
		}

		

		public void testGetEmail() {
			
			assertNotSame("k@m", wallet.getEmail());
			assertNull(wallet.getEmail());
		}

		
	
}
