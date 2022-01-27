package com.bank.pacakage;

import java.util.Random;
import java.util.Scanner;

public class bankApplication 
{
	  int balance,previousTransaction, amount,years;
		String cName,cNo,addr,email;
		Scanner sc=new Scanner(System.in);

		void details()
		{
			System.out.println("Enter your Name : ");
			cName=sc.next();
			System.out.println("Enter your Contact Number : ");
			cNo=sc.next();
			System.out.println("Enter your Email id: ");
			email=sc.next();
			System.out.println("Enter your Address : ");
			addr=sc.next();
			System.out.println("===============================================================");
		    System.out.println("Thank you for providing Details.");
			System.out.println("===============================================================");

		}
		
		//Random creation of account number
		void AccountNumber()
		{
		//String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String num="0123456789";
			System.out.println("Your Account Number is : ");

			String combination =  num;
			int leng=10;
			char[]accNo=new char[leng];
			Random r=new Random();
			for(int i=0;i<leng;i++)
			{
				accNo[i]=combination.charAt(r.nextInt(combination.length()));
			} 
			System.out.print(accNo);	
		/*	Random random=new Random();
			{
				System.out.println("Account Number is : " +random.nextInt());
			}   */
		}
		//depositing money
		void deposite()
		{
			System.out.println("=====================================================");
			System.out.println("Enter the amount you want to deposite : ");
			amount = sc.nextInt();
			if (amount !=0)
			{
				balance = balance + amount;
				previousTransaction=amount;
				System.out.println("Money Deposite Succesfully.");

			}
			System.out.println("=====================================================");

		}
		
		//function for withdrawing the money
		void withdraw()
		{
			System.out.println("=====================================================");
			System.out.println("Enter the amount you want to withdraw : ");
			amount=sc.nextInt();
			if (amount !=0)
			{
				balance = balance - amount;
				previousTransaction=-amount;
				System.out.println("Withdraw Succefully.");
			}
			System.out.println("=====================================================");
		}
		
		//function showing the previous transaction
		void getpreviousTransaction()
		{
			System.out.println("=====================================================");
			//getpreviousTransaction();
			if(previousTransaction > 0)
			{
				System.out.println("Deposited : " + previousTransaction);
			}
			else if(previousTransaction < 0)
			{
				System.out.println("Withdrawn : " +Math.abs(previousTransaction));
			}
			else {
				System.out.println("No transaction occurred");
			}
			System.out.println("=====================================================");

		}
		//function for calculating interest of current funds after a number of years
		void calulateintrest()
		{
			System.out.println("=====================================================");
			System.out.println("Enter how many years of accrued intrest : ");
			years=sc.nextInt();
			double intrestRate = .0195;
			double newBalance = (balance * intrestRate * years) + balance;
			System.out.println("The current intrest rate is " + (100*intrestRate) + "%");
			System.out.println("After "+ years + " years, you balance will be : " + newBalance);
			System.out.println("=====================================================");
		}
		
		// function showing the main menu
		void showMenu()
		{
			char option ='\0';
			System.out.println();
			System.out.println("What would you like to do ?");
			System.out.println();
			System.out.println("A. Check your Balance");
			System.out.println("B. Make a Deposite");
			System.out.println("C. Make a withdraw");
			System.out.println("D. View your Prevoius Transaction");
			System.out.println("E. Calculate Intrest");
			System.out.println("F. Exit");
			
		do {
			System.out.println();
			System.out.println("Enter an option : ");
			char option1 = sc.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch(option)
			{
				//Case 'A' allows the user to check their account balance
			case 'A' :
				System.out.println("=====================================================");
				System.out.println("Balance = $" +balance);
				System.out.println("=====================================================");
				System.out.println();
				break;
				
			//Allow user to deposit money in their account
			case 'B' :
				
				deposite ();
				System.out.println();
				break;
				
			// Allow the user to withdraw the money 
			case 'C' :
				
				withdraw();
				System.out.println();
				break;
				
			//Allow the user to view their recent transcation
			case 'D' :
				getpreviousTransaction();
				System.out.println();
				break;
				
			// calculate interest
			case 'E' :
				calulateintrest();
				break;
				
			//Exit function
			case 'F' :
				System.out.println("=====================================================");
				break;
			default: 
				System.out.println("Error : Invaild option. Please enter A,B,C,D,E,F ");
			}
		}
		while(option != 'F');
		System.out.println("Thank you for visiting!!!");
		System.out.println("=====================================================");

		}
		
		
		public static void main(String[] args) 
		{
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			System.out.println("WELCOME TO SIMPLE BANKING APPLICATION SYSTEM");
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			System.out.println("Provides some details....");
					bankApplication b=new bankApplication();
		 			b.details(); 
					b.AccountNumber();
					b.showMenu();
		}

	}


