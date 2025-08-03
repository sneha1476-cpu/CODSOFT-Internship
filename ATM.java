package com.internship;

import java.util.Scanner;

class BankAccount {
	private double Balance;
	private double amount;
	public BankAccount(double initialBalance) {
		this.Balance = initialBalance;
	}
	public boolean deposit(double amount) {
		if(amount>0) {
			Balance+=amount;
			return true;
		}
		return false;
	}
	public boolean withdraw(double amount) {
		if(amount>0 && amount<=Balance) {
			Balance-=amount;
			return true;
		}
		return false;
	}
	public double getBalance() {
		return Balance;
	}
}
 
public class ATM{
	private static BankAccount account;
	public static int menu(Scanner sc) {
		System.out.println("----menu-----");
		System.out.println("1. checkBalance");
		System.out.println("2. deposit");
		System.out.println("3. withdraw");
		System.out.println("4. Exit");
		System.out.println("enter the choice : ");
		int ch=sc.nextInt();
		return ch;
	}
		
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		account = new BankAccount(1000); 
		while(true) {
			int ch=menu(sc);
			switch(ch) 
			{
			case 1:
				System.out.println("current balance is :" +account.getBalance());
				break;
			
			case 2:
				System.out.println("enter the amount for the deposit :");
				double depositAmount=sc.nextDouble();
				if(account.deposit(depositAmount)) {
					System.out.println(depositAmount + "deposit amount successfully");
				}else {
					System.out.println("Invalid deposit ! deposit failed !!");
				}
				break;
			
			case 3:
				System.out.println("enter the amount for the withdraw :");
				double withdrawAmount=sc.nextDouble();
				if(account.withdraw(withdrawAmount)) {
					System.out.println(withdrawAmount + "withdraw amount successfully");
				}else {
					System.out.println("Invalid amount ! withdraw failed !!");
				}
				break;
			
			case 4:
				System.out.println("thank you for using the ATM .GoodDay!");
				System.exit(0);
				break;
				
			default :
				System.out.println("invalid choice , enter correct choice");
			}
			
		}
		
	}

}
