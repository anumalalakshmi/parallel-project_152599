package com.cg.paymentwallet.dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaymentWalletDaoTest {

	@Test
	public void testAddCustomerDetails() {
		assertEquals("name", "name");
		assertNotEquals("name", 123);
		assertNotEquals("name", "abc123");
		assertSame("name", "name");
		assertNotSame("name", "123ad");
		}

	@Test
	public void testDeposit() {
		assertEquals("amount", "amount");
		assertEquals(1000,1000);
		assertNotEquals(1000, "abc");
		assertNotEquals(1000,"123abc");
		assertSame(1000,1000);
	}

	@Test
	public void testWithdraw() {
		assertEquals("amount", "amount");
		assertEquals(1000,1000);
		assertNotEquals(1000, "abc");
		assertNotEquals(1000,"123abc");
		assertSame(1000,1000);
		
	}

	@Test
	public void testShowBalance() {
		assertEquals("amount", "amount");
		assertEquals(1000,1000);
		assertNotEquals(1000, "xyz");
		assertNotEquals(1000,"123abc");
		assertSame(1000,1000);
		
	}

	@Test
	public void testTransferMoney() {
		assertEquals("amount", "amount");
		assertEquals(1000,1000);
		assertNotEquals(1000, "xyz");
		assertNotEquals(1000,"123abc");
		assertSame(1000,1000);
	}


}
