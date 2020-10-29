package day_5_AccountManagement;

import java.util.Scanner;

public class AccountManagement {

	int accountNo,age,amount,mobileNo;
	String name;
	Scanner kb = new Scanner(System.in);
	void insertData()
	{
		
		System.out.print("Enter Account holder name : ");
		name = kb.next();
		
		System.out.print("Enter Account Number : ");
		accountNo = kb.nextInt();
		
		System.out.print("Enter Account holder agr: ");
		age = kb.nextInt();
		
		System.out.print("Enter Account amount  : ");
		amount = kb.nextInt();
		
		System.out.print("Enter Account holder mobile no. : ");
		mobileNo = kb.nextInt();	
	}
	
	void displayData()
	{
		System.out.println("Account holder name => "+name);
		System.out.println("Account Number => "+accountNo);
		System.out.println("Account holder agr => "+age);
		System.out.println("Account amount  => "+amount);
		System.out.println("Account holder mobile no. => "+mobileNo);
	}
	
	void depositAmount()
	{
		int deposit;
		System.out.print("How many amount can you deposite  : ");
		deposit = kb.nextInt();
		amount = amount + deposit;
	}
	
	void withdrawAmount()
	{
		int withdraw;
		System.out.print("How many amount can you withdraw  : ");
		withdraw = kb.nextInt();
		amount = amount - withdraw;
	}
	
	void accountBalance()
	{
		System.out.println();
		System.out.println();
		System.out.println("      Available Amount => "+amount);
		System.out.println();
		System.out.println();
	}
}
