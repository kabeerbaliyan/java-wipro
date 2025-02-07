package Wipro.Training;

import java.util.Scanner;

public class BankingApplication {

	double balance = 100000;
	
	public void processing(){	
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		
		System.out.println("Welcome to the Bank Apllication System");
		
		while(!exit) {
			
			System.out.println("\n Menu Bar - ");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Transfer Money");
			System.out.println("5. EXIT");
			
			int choice = sc.nextInt();
			
			switch(choice){
			
			case 1:
				CheckBalance();
				break;
				
			case 2:
				DepositMoney(sc);
				break;
				
			case 3:
				WithdrawMoney(sc);
				break;
				
			case 4:
				TransferMoney(sc);
				break;
				
			case 5:
				System.out.println("Thankyou for using the bank system, Have a good day !");
				exit = true;
				break;
				
			default:
				System.out.println("Not enter the valid choice!,Please try again.");
					
				
			}
			
		}
		sc.close();


	}
	
	public void CheckBalance() {
		System.out.printf("\nYour current balance is : INR"+ " " +balance);
		System.out.println();
		
		
	}
	public void DepositMoney(Scanner sc) {
		System.out.println("Enter the amount to be deposit: INR ");
		double amount = sc.nextDouble();
		
		if(amount>0) {
			balance = balance + amount;
			System.out.printf("Money Deposit Sucessfully"+ " " +amount);
			CheckBalance();
		}else {
			System.out.println("Invalid Amount, Please enter the positive amount");
		}
		
	}
	
	public void WithdrawMoney(Scanner sc) {
		System.out.println("Enter the amount to be withdraw: INR");
		double amount = sc.nextDouble();
		
		
		if(amount > 0 && amount <=balance) {
			balance = balance - amount;
			System.out.printf("Amount sucessfully withdraw from the acount"+" " +amount);
			CheckBalance();
			
			
		}
		else if(amount > balance){
			System.out.println("Insufficient Balance");
			
		}
		else {
			System.out.println("Please enter the positive value");
		}
		
		
	}
	
	public void TransferMoney(Scanner sc) {
		
		System.out.println("Enter the amount to be transferred: INR");
		double amount = sc.nextDouble();
		
		System.out.println("Enter the Account Number of the recipient");
		String accountNumber = sc.next();
		
		if(amount>0 && amount <= balance) {
			balance = balance - amount;
			System.out.printf("Amount sucessfully transfered to the accountNumber"+ " " + amount+ " " +accountNumber);
			CheckBalance();
		}
			else if (amount > balance) {
				System.out.println("Insufficient Balance.");
				
			}else {
				System.out.println("Please Enter the Positive Value");
			}
		
		
	}
	
	public static void main(String [] args) {
		BankingApplication bankingsystem = new BankingApplication();
		bankingsystem.processing();
		
	}
	

}
