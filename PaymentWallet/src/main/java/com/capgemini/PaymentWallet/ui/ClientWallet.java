package com.capgemini.PaymentWallet.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

import com.capgemini.PaymentWallet.bean.BankWallet;
import com.capgemini.PaymentWallet.service.PaymentWalletService;


public class ClientWallet {
	public static void main(String[] args) {
		Random r = new Random();
		String phoneNumber;
		String phoneNumber1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BankWallet wallet = new BankWallet();
		PaymentWalletService service = new PaymentWalletService();
        int transaction_id = 0;
		int option;
		do {
		System.out.println("=================================");
        System.out.println("WELCOME");
		System.out.println("1.Create Account");
		System.out.println("2.Depoist Amount");
		System.out.println("3.Withdraw Amount");
		System.out.println("4.Show Balance");
		System.out.println("5.Transfer Money");
		System.out.println("6.Print All Transactions");
		System.out.println("=================================");
		Scanner s = new Scanner(System.in);
		option = s.nextInt();
		switch (option) {
		case 1:
			System.out.println("You can create an accoutnt. Fill up the following details");
			try {
				System.out.println("Enter your name:\n");
                String name= br.readLine();
                
                System.out.println("Enter Adhar Number\n");
                long adharNumber = Long.parseLong(br.readLine());
                
                System.out.println("Enter Phone Number:\n");
                phoneNumber = br.readLine();
                
                System.out.println("Enter your Email:\n");
                String email = br.readLine();
                
                System.out.println("Enter Age:\n");
                int age = Integer.parseInt(br.readLine());
                
                System.out.println("Enter gender:\n");
                String gender = br.readLine();
                
                transaction_id = r.nextInt(90000000) + (10000000);
				System.out.println("Your transaction id id" +transaction_id);
				
				wallet.setName(name);
				wallet.setAdharNumber(adharNumber);
				wallet.setPhoneNumber(phoneNumber);
				wallet.setEmail(email);
				wallet.setAge(age);
				wallet.setGender(gender);
				wallet.setTransaction_id(transaction_id);
				break;
				
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			break;
		case 2:
			System.out.println("2.Deposit Money");
			System.out.println("Enter Mobile Number: ");
			phoneNumber=s.next();
			System.out.println("Enter amount to deposit");
			double amount =s.nextDouble();				
			wallet = service.deposit(phoneNumber, amount);
			System.out.println(wallet);
			
			break;
		case 3:
			System.out.println("3.Withdraw Amount");
			System.out.println("Enter Mobile Number: ");
		    phoneNumber=s.next();
			System.out.println("Enter amount to withdraw");
			double amount1 =s.nextDouble();				
			wallet = service.withdraw(phoneNumber, amount1);
			System.out.println(wallet);
			
			
			break;
		case 4:
			System.out.println("4.Show Balance");
			System.out.println("Enter phone number");
			phoneNumber = s.next();
			double amount2 = s.nextDouble();
			double show = service.showBalance(amount2);
			System.out.println(show);
			
			break;
		case 5:
			System.out.println("5.Transfer Money");
			
			break;
		case 6:
			System.out.println("6.Print All Transactions");
			break;
		}
			
		
		}while(option != 7);
	}
}
	

		
		



		
	


