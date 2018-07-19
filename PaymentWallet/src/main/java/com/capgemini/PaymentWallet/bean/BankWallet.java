package com.capgemini.PaymentWallet.bean;

public class BankWallet {
	private int transaction_id;
	private String name;
	private long adharNumber;
	private String phoneNumber;
	private String email;
	private int age;
	private String gender;
	private double balance;
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankWallet [transaction_id=" + transaction_id + ", name=" + name + ", adharNumber=" + adharNumber
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", age=" + age + ", gender=" + gender
				+ ", balance=" + balance + "]";
	}
	

}
